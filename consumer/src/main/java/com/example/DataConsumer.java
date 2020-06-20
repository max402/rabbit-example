package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(DataChannel.class)
public class DataConsumer {
    @SuppressWarnings("unused")
    @StreamListener(DataChannel.NAME)
    public void receive(String messageString) {
        log.info("received message");
    }
}
