package com.github.pig.hydrological.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.hydrological.model.entity.BizWaterHistory;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuchong
 * @since 2018-09-21
 */
public interface BizWaterHistoryMapper extends BaseMapper<BizWaterHistory> {

	public List<BizWaterHistory> selectList(Page<BizWaterHistory> page, Map<String, Object> queryMap);

	public List<BizWaterHistory> getList();

	public Integer deleteWaterByPriKey();
}
