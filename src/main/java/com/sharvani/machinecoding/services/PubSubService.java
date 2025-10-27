package com.sharvani.machinecoding.services;

import com.sharvani.machinecoding.entities.*;
import com.sharvani.machinecoding.poller.SubscriptionPoller;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PubSubService {

    private static volatile PubSubService instance;
    private final Map<String, Topic> topicMap;
    private final Map<String, Subscription> subscriptions;
    private final Map<String, SubscriptionPoller> pollers;
    //TODO - ideally we also have a subscriberId -> subscriber map

    private PubSubService() {
        topicMap = new ConcurrentHashMap<>();
        subscriptions = new ConcurrentHashMap<>();
        pollers = new ConcurrentHashMap<>();
    }

    public static synchronized PubSubService getInstance() {
        if (instance == null) instance = new PubSubService();
        return instance;
    }

    public void createTopic(String topicName) {
        if (topicMap.containsKey(topicName))
            throw new UnsupportedOperationException("Topic " + topicName + " already exists");
        Topic topic = new TopicImpl(topicName);
        topicMap.putIfAbsent(topicName, topic);
    }

    public String publishToTopic(String topicName, Message message) {
        if (!topicMap.containsKey(topicName))
            throw new UnsupportedOperationException("Topic " + topicName + " does not exist");

        String messageId = topicMap.get(topicName).publish(message);
        System.out.println("Published " + messageId + " with payload " + message.payload().toString() + " to topic " + topicName);
        return messageId;
    }

    public synchronized void subscribeToTopic(String topicName, Subscriber subscriber) {
        if (!topicMap.containsKey(topicName))
            throw new UnsupportedOperationException("Topic " + topicName + " does not exist");
        Subscription subscription = new SubscriptionImpl(UUID.randomUUID().toString(), topicName);
        subscriber.subscribe(topicName, subscription.id());
        subscriptions.putIfAbsent(subscription.id(), subscription);
        SubscriptionPoller subscriptionPoller = new SubscriptionPoller(subscription.id(), this, 5);
        pollers.put(subscription.id(), subscriptionPoller);
        subscriptionPoller.start();
        System.out.println("Subscriber " + subscriber.id() + " subscribed to topic " + topicName + " with subscription id " + subscription.id());
    }

    public synchronized void unsubscribe(Subscriber subscriber, String subscriptionId) throws UnsupportedOperationException {
        if (!subscriptions.containsKey(subscriptionId))
            throw new UnsupportedOperationException("Subscriber " + subscriptionId + " does not exist");
        Subscription subscription = subscriptions.remove(subscriptionId);
        subscriber.unsubscribe(subscriptionId);
        SubscriptionPoller subscriptionPoller = pollers.get(subscription.id());
        pollers.remove(subscription.id());
        subscriptionPoller.stop();
        System.out.println("Subscriber subscribed from topic " + subscription.topicName()
                + " with subscription id " + subscriber.id());
    }

    public List<Message> consumeMessages(String subscriptionId, int maxMessages) {
        Subscription subscription = subscriptions.get(subscriptionId);
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription ID not found: " + subscriptionId);
        }
        Topic topic = topicMap.get(subscription.topicName());
        int offset = subscription.offset();
        List<Message> messages = topic.getMessages(subscription.offset(), maxMessages);
        if (messages.size() > 0)
            System.out.println("Consumed " + messages.size() + " messages from subscription " + subscriptionId);
        return messages;
    }

    public void ack(String subscriptionId, List<String> messageIds) {
        Subscription subscription = subscriptions.get(subscriptionId);
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription ID not found: " + subscriptionId);
        }
        subscription.ack(messageIds);
    }

    public void shutdown() {
        pollers.values().forEach(SubscriptionPoller::stop);
    }
}
