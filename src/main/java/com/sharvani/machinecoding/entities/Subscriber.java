package com.sharvani.machinecoding.entities;

import java.util.List;

public interface Subscriber {
    String id();
    void subscribe(String topicName, String subscriptionId); //returns a subscription ID
    void unsubscribe(String topicName);
    List<Message> pull(String subscriptionId, int maxMessages);
    void ack(String subscriptionId, List<String> messageIds);
}
