package com.nuri.scheduler.store.mapper;

import com.nuri.scheduler.store.jpo.DcuJpo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DcuMapper {

    List<DcuJpo> findAllByCondition(DcuJpo param) throws Exception;

    int count(DcuJpo param) throws Exception;

    DcuJpo findById(String dcuId) throws Exception;

    int existDcuById(String dcuId) throws Exception;
}