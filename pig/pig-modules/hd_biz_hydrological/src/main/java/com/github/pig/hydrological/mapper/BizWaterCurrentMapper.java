package com.github.pig.hydrological.mapper;
import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.hydrological.model.entity.BizWaterCurrent;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuchong
 * @since 2018-09-21
 */
public interface BizWaterCurrentMapper extends BaseMapper<BizWaterCurrent> {

	public List<BizWaterCurrent> selectList();

}
