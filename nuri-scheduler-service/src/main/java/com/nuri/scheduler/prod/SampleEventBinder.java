package com.nuri.scheduler.prod;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(SampleEventSource.class)
public class SampleEventBinder implements EventProducer {

    private final SampleEventSource sampleEventSource;

    public SampleEventBinder(SampleEventSource sampleEventSource) {
        this.sampleEventSource = sampleEventSource;
    }

    @Override
    public void publish(String payload) {
        log.info("payload : {}", payload);

        boolean result = sampleEventSource.sampleEventChannel().send(MessageBuilder.withPayload(payload).build());
        log.info("result : {}", result);
    }
}