package com.nuri.scheduler.spec;

import com.nuri.scheduler.entity.Dcu;

import java.util.List;

public interface SampleService {

    List<Dcu> findDcus();

    Dcu findById(String dcuId);
}
