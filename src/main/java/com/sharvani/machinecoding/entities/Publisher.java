package com.sharvani.machinecoding.entities;

public interface Publisher {
    String id();
    String publish(String topicName, Message message); //returns the message ID
}
