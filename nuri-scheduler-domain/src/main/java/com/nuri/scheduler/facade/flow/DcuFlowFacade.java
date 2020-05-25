package com.nuri.scheduler.facade.flow;

import com.nuri.scheduler.entity.Dcu;

public interface DcuFlowFacade {
    Dcu findDcuById(String dcuId);
}
