package com.sharvani.machinecoding.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TopicImpl implements Topic {

    private final String name;
    private final Map<String, Subscription> subscriptions;
    private final List<Message> messages;

    public TopicImpl(String name) {
        this.name = name;
        this.subscriptions = new ConcurrentHashMap<>();
        this.messages = Collections.synchronizedList(new ArrayList<>());
    }

    @Override public String name() { return this.name; };

    @Override public String publish(Message message) {
        this.messages.add(message);
        return message.messageId();
    };

    @Override public List<Message> getMessages(int offset, int maxMessages) {
        synchronized(messages) {
            int size = messages.size();
            if (offset < 0 || offset >= size) { return Collections.emptyList(); }
            int toIndex = Math.min(offset + maxMessages, size);
            return new ArrayList<>(messages.subList(offset, toIndex)); //offset is next message to be consumed
        }
    }

    @Override public int messageCount() { return this.messages.size(); }

    @Override public List<String> subscriptions() { return new ArrayList<>(this.subscriptions.keySet()); }

    @Override
    public void addSubscription(Subscription subscription) {
        subscriptions.put(subscription.id(), subscription);
    }

    @Override
    public void removeSubscription(String subscriptionId) {
        subscriptions.remove(subscriptionId);
    }
}
