package com.github.pig.hydrological.mapper;

import com.github.pig.hydrological.model.entity.BizWaterHistory;
import com.github.pig.hydrological.model.entity.BizStationInfo;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuchong
 * @since 2018-09-21
 */
public interface BizStationInfoMapper extends BaseMapper<BizStationInfo> {

	public List<BizStationInfo> selectList();

}
