package com.nuri.scheduler.store;

import com.nuri.scheduler.entity.Dcu;

import java.util.List;

public interface DcuStore {

    List<Dcu> retrieveAllDcus(Dcu dcu);

    Dcu retrieveById(String dcuId);

    boolean existDcuById(String dcuId);
}