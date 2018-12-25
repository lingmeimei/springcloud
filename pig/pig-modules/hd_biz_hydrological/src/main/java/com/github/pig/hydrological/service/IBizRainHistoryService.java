package com.github.pig.hydrological.service;

import com.github.pig.hydrological.model.entity.BizRainHistory;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
public interface IBizRainHistoryService extends IService<BizRainHistory> {

	List<BizRainHistory> selectList();

	List<BizRainHistory> getList(String type);
	
	List<BizRainHistory> getListRe();

	int insertWater(BizRainHistory bizRainHistory);

	void deleteWaterByPriKey(Map<String, Object> queryMap);

}
