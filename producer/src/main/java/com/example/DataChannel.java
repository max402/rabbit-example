package com.example;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface DataChannel {
    String NAME = "Data";

    @Output(NAME)
    MessageChannel sendChannel() throws Exception;
}
