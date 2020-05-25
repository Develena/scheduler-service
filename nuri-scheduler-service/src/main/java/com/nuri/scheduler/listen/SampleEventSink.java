package com.nuri.scheduler.listen;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface SampleEventSink {
    String SAMPLE_INPUT_CHANNEL = "sampleInputChannel";

    @Input(SAMPLE_INPUT_CHANNEL)
    SubscribableChannel sampleInputChannel();
}
