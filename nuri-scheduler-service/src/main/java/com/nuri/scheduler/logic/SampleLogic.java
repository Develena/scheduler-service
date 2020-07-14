package com.nuri.scheduler.logic;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.lifecycle.StoreLifeCycle;
import com.nuri.scheduler.spec.SampleService;
import com.nuri.scheduler.store.DcuStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/* ServiceImpl */
@Service
@Transactional
public class SampleLogic implements SampleService {

    private final DcuStore dcuStore;

    public SampleLogic(DcuStore dcuStore) {
        this.dcuStore = dcuStore;
    }

    @Override
    public List<Dcu> findDcus() {
        return this.dcuStore.retrieveAllDcus(null);
    }

    @Override
    public Dcu findById(String dcuId) {
        return this.dcuStore.retrieveById(dcuId);
    }
}
