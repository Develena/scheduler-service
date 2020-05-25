package com.nuri.scheduler.flow;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.facade.flow.DcuFlowFacade;
import com.nuri.scheduler.spec.SampleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DcuFlow implements DcuFlowFacade {

    // note - 여러 서비스를 호출 해서 사용할 때
    private SampleService sampleService;
    public DcuFlow(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @Override
    public Dcu findDcuById(String dcuId) {
        return this.sampleService.findById(dcuId);
    }
}