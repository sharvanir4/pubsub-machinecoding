package com.sharvani.machinecoding.entities;

import java.util.List;

public interface Topic {
    String name();
    String publish(Message message);
    List<Message> getMessages(int offset, int maxMessages);
    int messageCount();
    List<String> subscriptions(); //returns ids of the subscriptions
    void addSubscription(Subscription subscription);
    void removeSubscription(String subscriptionId);
}
