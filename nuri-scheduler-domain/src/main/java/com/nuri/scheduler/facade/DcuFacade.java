package com.nuri.scheduler.facade;

import com.nuri.scheduler.entity.Dcu;

public interface DcuFacade {
    Dcu findDcuById(String dcuId);
}
