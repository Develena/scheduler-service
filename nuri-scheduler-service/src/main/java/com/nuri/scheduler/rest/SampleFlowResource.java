package com.nuri.scheduler.rest;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.facade.flow.DcuFlowFacade;
import com.nuri.scheduler.flow.DcuFlow;
import org.springframework.web.bind.annotation.*;


/* Controller */
@CrossOrigin("*")
@RequestMapping("/v0.1")
@RestController
public class SampleFlowResource implements DcuFlowFacade {

    private final DcuFlow dcuFlow;
    public SampleFlowResource(DcuFlow dcuFlow) {
        this.dcuFlow = dcuFlow;
    }

    @Override
    @GetMapping("/facade/flow/dcus/{dcuId}")
    public Dcu findDcuById(@PathVariable String dcuId) {
        return this.dcuFlow.findDcuById(dcuId);
    }
}
