package com.example;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageGenerator {
    public static final long PRODUCER_TIMEOUT_MS = 200L;

    private final DataChannel dataChannel;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5) // every 5ms
    public void reportCurrentTime() throws Exception {
        String msg = "The time is now {}" + dateFormat.format(new Date());
        dataChannel.sendChannel().send(new GenericMessage<Object>(msg), PRODUCER_TIMEOUT_MS);
//        log.info(msg);
    }
}
