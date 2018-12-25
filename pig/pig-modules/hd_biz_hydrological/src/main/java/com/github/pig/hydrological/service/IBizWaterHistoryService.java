package com.github.pig.hydrological.service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.hydrological.model.entity.BizWaterHistory;

public interface IBizWaterHistoryService{

	Page<BizWaterHistory> selectList(Page<BizWaterHistory> pg, Map<String, Object> queryMap);

	List<BizWaterHistory> getList();

	Integer deleteWaterByPriKey(Map<String, Object> queryMap);

	int insertWater(BizWaterHistory bizWaterHistory);

}
