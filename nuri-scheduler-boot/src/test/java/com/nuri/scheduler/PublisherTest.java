package com.nuri.scheduler;

import com.nuri.scheduler.prod.SampleEventBinder;
import com.nuri.scheduler.spec.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PublisherTest {

    @Autowired
    SampleEventBinder sampleEventBinder;

    private SampleService sampleService = null;

    @Test
    public void test() {

        sampleEventBinder.publish("sample2222222222222222222222");
    }
}
