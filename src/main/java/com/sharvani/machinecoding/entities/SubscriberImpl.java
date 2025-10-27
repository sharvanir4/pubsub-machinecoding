package com.sharvani.machinecoding.entities;

import com.sharvani.machinecoding.services.PubSubService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SubscriberImpl implements Subscriber {

    private final String id;
    private final PubSubService pubSubService;
    private final Map<String, String> perTopicSubscription;

    public SubscriberImpl(String id, PubSubService pubSubService) {
        this.id = id;
        this.perTopicSubscription = new ConcurrentHashMap<>();
        this.pubSubService = pubSubService;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override public void subscribe(String topicName, String subscriptionId) {
        if (!perTopicSubscription.containsKey(topicName))
            perTopicSubscription.put(topicName, subscriptionId);
    }

    @Override public void unsubscribe(String topicName) {
        perTopicSubscription.remove(topicName);
    }

    @Override public List<Message> pull(String topicName, int maxMessages) {
        String subscriptionId = perTopicSubscription.get(topicName);
        return pubSubService.consumeMessages(subscriptionId, maxMessages);
    }

    @Override public void ack(String subscriptionId, List<String> messageIds) { //to be called after successful processing, not after pull
        pubSubService.ack(subscriptionId, messageIds);
    }

}
