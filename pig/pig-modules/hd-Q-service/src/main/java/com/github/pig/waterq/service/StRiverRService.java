package com.github.pig.waterq.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.waterq.model.entity.StRiverR;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 国标库河道水情表 服务类
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
public interface StRiverRService extends IService<StRiverR> {

    public Page selectMultipleDataPage(Query<Object> query, EntityWrapper<Object> wrapper);
}
