package com.sharvani.machinecoding.entities;

import com.sharvani.machinecoding.services.PubSubService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PublisherImpl implements Publisher {

    private final String id;
    private final PubSubService pubSubService;

    @Override
    public String id() {
        return id;
    }

    @Override
    public String publish(String topicName, Message message) {
        return pubSubService.publishToTopic(topicName, message); //returns the message ID
    }
}
