package com.sharvani.machinecoding.entities;

import com.sharvani.machinecoding.services.PubSubService;

import java.util.List;

public class SubscriptionImpl implements Subscription {
    private final String id;
    private final String topicName;
    private int offset; //acked offset
    private int pulledOffset;

    public SubscriptionImpl(String id, String topicName) {
        this.id = id;
        this.topicName = topicName;
        this.offset = 0;
        this.pulledOffset = 0;
    }

    @Override
    public String id() { return this.id; }

    @Override
    public String topicName() { return topicName;}

    @Override
    public synchronized List<Message> pull(int maxMessages) {
        List<Message> messages = PubSubService.getInstance().consumeMessages(id, maxMessages);
        pulledOffset += messages.size();
        return messages;
    }

    @Override
    public synchronized void ack(List<String> messageIds) {
        offset += messageIds.size();
    }

    @Override
    public synchronized int offset() { return this.offset; }

    @Override
    public synchronized void seek(int offset) {
        this.offset = offset;
        this.pulledOffset = offset;
    }

    @Override
    public void unsubscribe() {
        //no cleanup needed for this implementation}
    }
}