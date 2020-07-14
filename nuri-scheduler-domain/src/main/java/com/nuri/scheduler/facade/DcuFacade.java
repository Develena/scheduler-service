package com.nuri.scheduler.facade;

import com.nuri.scheduler.entity.Dcu;

/* 외부 제공 서비스용 : 리소스, API 형태로 제공할 목적(Controller 용 인터페이스) */
public interface DcuFacade {
    Dcu findDcuById(String dcuId);
}
