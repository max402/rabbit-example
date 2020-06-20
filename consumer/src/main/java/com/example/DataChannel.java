package com.example;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DataChannel {
    String NAME = "Data";

    @Input(NAME)
    @SuppressWarnings("unused")
    SubscribableChannel receive();
}
