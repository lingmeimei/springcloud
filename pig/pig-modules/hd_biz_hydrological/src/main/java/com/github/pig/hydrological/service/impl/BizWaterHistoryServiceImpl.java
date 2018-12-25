package com.github.pig.hydrological.service.impl;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.hydrological.model.entity.BizWaterHistory;
import com.github.pig.hydrological.mapper.BizWaterHistoryMapper;
import com.github.pig.hydrological.service.IBizWaterHistoryService;

@Service
public class BizWaterHistoryServiceImpl extends ServiceImpl<BizWaterHistoryMapper, BizWaterHistory>implements IBizWaterHistoryService {

	@Autowired
	private BizWaterHistoryMapper bizWaterHistoryMapper;

	@Override
	public Page<BizWaterHistory> selectList(Page<BizWaterHistory> page, Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return page.setRecords(bizWaterHistoryMapper.selectList(page,queryMap));
	}

	@Override
	public List<BizWaterHistory> getList() {
		// TODO Auto-generated method stub
		return bizWaterHistoryMapper.getList();
	}

	@Override
	public Integer deleteWaterByPriKey(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return bizWaterHistoryMapper.deleteWaterByPriKey();
	}

	@Override
	public int insertWater(BizWaterHistory bizWaterHistory) {
		// TODO Auto-generated method stub
		return bizWaterHistoryMapper.insert(bizWaterHistory);
	}
}
