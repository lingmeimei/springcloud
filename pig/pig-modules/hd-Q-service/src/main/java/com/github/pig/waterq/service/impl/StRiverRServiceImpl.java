package com.github.pig.waterq.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.github.pig.common.util.Query;
import com.github.pig.waterq.model.entity.StRiverR;
import com.github.pig.waterq.mapper.StRiverRMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.waterq.service.StRiverRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 国标库河道水情表 服务实现类
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
@Service
public class StRiverRServiceImpl extends ServiceImpl<StRiverRMapper, StRiverR> implements StRiverRService {

    @Autowired StRiverRMapper stRiverRMapper;

    @Override
    public Page selectMultipleDataPage(Query<Object> query, EntityWrapper<Object> wrapper) {
        query.setRecords(stRiverRMapper.selectMultipleDataPage(query, query.getCondition()));
        return query;
    }
}
