package com.nuri.scheduler.rest;

import com.nuri.scheduler.entity.Dcu;

import com.nuri.scheduler.facade.DcuFacade;
import com.nuri.scheduler.spec.SampleService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/v0.1")
@RestController
public class SampleResource implements DcuFacade {

    private final SampleService sampleService;

    public SampleResource(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping(value={"/hello"})
    public String hello() {
        return "Hello Sample Project";
    }

    @Override
    @GetMapping("/facade/dcus/{dcuId}")
    public Dcu findDcuById(@PathVariable String dcuId) {
        return this.sampleService.findById(dcuId);
    }

//    @Override
//    @GetMapping(value={"/dcus"})
//    public List<Dcu> findDcus() {
//        return this.sampleService.findDcus();
//    }
//
//    @Override
//    public Dcu findById(String dcuId) {
//        return null;
//    }
}