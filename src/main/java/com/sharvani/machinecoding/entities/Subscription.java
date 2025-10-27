package com.sharvani.machinecoding.entities;

import java.util.List;

public interface Subscription {
    String id();
    String topicName();
    List<Message> pull(int maxMessages);
    void ack(List<String> messageIds);
    int offset();
    void seek(int offset);
    void unsubscribe();
}
