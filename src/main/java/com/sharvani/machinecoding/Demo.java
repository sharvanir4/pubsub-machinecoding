package com.sharvani.machinecoding;

import com.sharvani.machinecoding.entities.*;
import com.sharvani.machinecoding.services.PubSubService;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        PubSubService pubSubService = PubSubService.getInstance();

        // Create topics
        pubSubService.createTopic("SportsTopic");
        pubSubService.createTopic("NewsTopic");

        //create publishers
        Publisher publisher1 = new PublisherImpl("publisher1", pubSubService);
        Publisher publisher2 = new PublisherImpl("publisher2", pubSubService);

        // Create subscribers who subscribe to multiple topics
        Subscriber subscriber1 = new SubscriberImpl("subscriber1", pubSubService);
        Subscriber subscriber2 = new SubscriberImpl("subscriber2", pubSubService);

        // Add subscriptions - automatically starts polling each subscription
        pubSubService.subscribeToTopic("SportsTopic", subscriber1);
        pubSubService.subscribeToTopic("SportsTopic", subscriber2);
        pubSubService.subscribeToTopic("NewsTopic", subscriber1);
        pubSubService.subscribeToTopic("NewsTopic", subscriber2);

        // Start multiple publisher threads publishing concurrently to topics
        ExecutorService publisherPool = Executors.newFixedThreadPool(2);

        publisherPool.submit(() -> {
            for (int i = 1; i <= 20; i+=2) {
                Message message = new MessageImpl(UUID.randomUUID().toString(), "Sports update #" + i,
                        makeMessageMetadata(publisher1.id()), Instant.now());
                publisher1.publish("SportsTopic", message);
                message = new MessageImpl(UUID.randomUUID().toString(), "Sports update #" + (i+1),
                        makeMessageMetadata(publisher2.id()), Instant.now());
                publisher2.publish("SportsTopic", message);
                sleep(50);
            }
        });

        publisherPool.submit(() -> {
            for (int i = 21; i <= 40; i+=2) {
                Message message = new MessageImpl(UUID.randomUUID().toString(), "News update #" + i,
                        makeMessageMetadata(publisher1.id()), Instant.now());
                publisher1.publish("NewsTopic", message);
                message = new MessageImpl(UUID.randomUUID().toString(), "News update #" + (i+1),
                        makeMessageMetadata(publisher2.id()), Instant.now());
                publisher2.publish("NewsTopic", message);
                sleep(30);
            }
        });

        // Let demo run for 40 seconds to consume messages
        Thread.sleep(40000);

        // Shutdown services
        publisherPool.shutdownNow();
        pubSubService.shutdown();
    }

    private static void sleep(long millis) {
        try { Thread.sleep(millis); } catch (InterruptedException ignored) {}
    }

    private static Map<String, String> makeMessageMetadata(String publisher) { //TODO: this metadata needs to be created
        //and added to message by pubsubservice
        Map<String, String> metadata = new HashMap<>();
        metadata.put("publisher", publisher);
        return metadata;
    }
}
