package com.nuri.scheduler.spec;

import com.nuri.scheduler.entity.Dcu;

import java.util.List;

/* -Service : MVC 패턴의 서비스.*/
public interface SampleService {

    List<Dcu> findDcus();

    Dcu findById(String dcuId);
}
