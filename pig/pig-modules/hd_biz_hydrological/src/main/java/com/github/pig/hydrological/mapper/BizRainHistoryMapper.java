package com.github.pig.hydrological.mapper;

import com.github.pig.hydrological.model.entity.BizRainHistory;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
public interface BizRainHistoryMapper extends BaseMapper<BizRainHistory> {

	List<BizRainHistory> selectList();

	List<BizRainHistory> getByDay();
	List<BizRainHistory> getByMonth();
	List<BizRainHistory> getByYear();

	void deleteWaterByPriKey(Map<String, Object> queryMap);

	List<BizRainHistory> getListRe();

}
