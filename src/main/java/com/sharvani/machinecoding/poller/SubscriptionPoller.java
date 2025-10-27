package com.sharvani.machinecoding.poller;

import com.sharvani.machinecoding.entities.Message;
import com.sharvani.machinecoding.services.PubSubService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Polls topic for messages yet to be consumed
 */
public class SubscriptionPoller {
    private final String subscriptionId;
    private final PubSubService pubSubService;
    private final ExecutorService executor;
    private volatile boolean isRunning;
    int messagesAtATime;

    public SubscriptionPoller(String subscriptionId, PubSubService pubSubService, int messagesAtATime) {
        this.subscriptionId = subscriptionId;
        this.pubSubService = pubSubService;
        this.isRunning = false;
        this.executor = Executors.newSingleThreadExecutor(); // so we process in order
        this.messagesAtATime = messagesAtATime;
    }

    public void start() {
        isRunning = true;
        executor.submit(() -> {
            try {
                while(isRunning && !Thread.currentThread().isInterrupted()) {
                    List<Message> messages = pubSubService.consumeMessages(subscriptionId, messagesAtATime);
                    if (messages.isEmpty()) {
                        Thread.sleep(10);
                    } else {
                        List<String> ackIds = new ArrayList<>();
                        //processing here would just be a print
                        for(Message message : messages) {
                            System.out.println("Polled message " + message.messageId() + " for subscription " + subscriptionId +
                                    " with payload " + message.payload() + " and metadata " + message.metadata().toString());
                            ackIds.add(message.messageId());
                        }
                        pubSubService.ack(subscriptionId, ackIds);
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            } //TODO - better exception handling
        });
    }

    public void stop() {
        isRunning = false; // signal poller thread to finish
        executor.shutdown(); // stop accepting new tasks
        try {
            if (!executor.awaitTermination(20, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // cancel running tasks if timeout
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
