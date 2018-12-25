package com.github.pig.hydrological.mapper;

import com.github.pig.hydrological.model.entity.BizRainCurrent;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
public interface BizRainCurrentMapper extends BaseMapper<BizRainCurrent> {

	List<BizRainCurrent> selectList();

}
