package com.sharvani.machinecoding.entities;

import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.Map;

@AllArgsConstructor
public class MessageImpl implements Message {
    private final String messageId;
    private final Object payload;
    private final Map<String, String> metadata;
    private final Instant timestamp;

    @Override public String messageId() { return this.messageId; }

    @Override public Object payload() { return this.payload; }

    @Override public Map<String, String> metadata() { return this.metadata; };

    @Override public Instant timestamp() { return this.timestamp; }
}
