package com.nuri.scheduler.lifecycle;

import com.nuri.scheduler.store.DcuStore;

public interface StoreLifeCycle {
    DcuStore requestDcuStore();
}
