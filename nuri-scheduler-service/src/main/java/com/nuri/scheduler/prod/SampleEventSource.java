package com.nuri.scheduler.prod;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SampleEventSource {
    String SAMPLE_OUTPUT_CHANNEL = "sampleOutputChannel";

    @Output(SAMPLE_OUTPUT_CHANNEL)
    MessageChannel sampleEventChannel();
}
