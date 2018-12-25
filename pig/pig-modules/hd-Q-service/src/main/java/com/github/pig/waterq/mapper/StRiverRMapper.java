package com.github.pig.waterq.mapper;

import com.github.pig.common.util.Query;
import com.github.pig.waterq.model.dto.MultipleData;
import com.github.pig.waterq.model.entity.StRiverR;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 国标库河道水情表 Mapper 接口
 * </p>
 *
 * @author xlhua
 * @since 2018-11-09
 */
public interface StRiverRMapper extends BaseMapper<StRiverR> {

    List<Object> selectMultipleDataPage(Query<Object> query, Map<String, Object> condition);
}
