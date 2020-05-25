package com.nuri.scheduler.store;

import com.nuri.scheduler.entity.Dcu;
import com.nuri.scheduler.store.jpo.DcuJpo;
import com.nuri.scheduler.store.mapper.DcuMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DcuMapperStore implements DcuStore {

    private final DcuMapper dcuMapper;

    public DcuMapperStore(DcuMapper dcuMapper) {
        this.dcuMapper = dcuMapper;
    }

    @Override
    public List<Dcu> retrieveAllDcus(Dcu dcu) {
        List<DcuJpo> dcuJpos = null;
        try {
            dcuJpos = dcuMapper.findAllByCondition(new DcuJpo(dcu));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dcuJpos.stream().map(DcuJpo::toDomain).collect(Collectors.toList());
    }

    @Override
    public Dcu retrieveById(String dcuId) {
        DcuJpo dcuJpo = null;
        try {
            dcuJpo = dcuMapper.findById(dcuId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dcuJpo.toDomain();
    }

    @Override
    public boolean existDcuById(String dcuId) {
        boolean result = false;
        try {
            int count = dcuMapper.existDcuById(dcuId);
            result = (count > 0)? true : false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
