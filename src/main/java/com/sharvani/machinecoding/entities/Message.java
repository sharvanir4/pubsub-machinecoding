package com.sharvani.machinecoding.entities;

import java.time.Instant;
import java.util.Map;

public interface Message {
    String messageId();
    Object payload(); //serialized data of any kind
    Map<String, String> metadata();
    Instant timestamp(); //publish time
}
