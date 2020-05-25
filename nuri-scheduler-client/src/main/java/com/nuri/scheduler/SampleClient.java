package com.nuri.scheduler;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.spec.SampleService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="sample")
public interface SampleClient extends SampleService {

    @GetMapping(value={"/sample/v0.1/hello"})
    public String hello();

    @GetMapping(value={"/sample/v0.1/dcus"})
    public List<Dcu> findDcus();
}
