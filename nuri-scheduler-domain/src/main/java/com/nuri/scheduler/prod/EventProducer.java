package com.nuri.scheduler.prod;

public interface EventProducer {
    void publish(String payload);
}
