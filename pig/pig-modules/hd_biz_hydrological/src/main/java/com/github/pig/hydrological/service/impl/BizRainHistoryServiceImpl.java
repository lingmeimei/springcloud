package com.github.pig.hydrological.service.impl;

import com.github.pig.hydrological.model.entity.BizRainHistory;
import com.github.pig.hydrological.mapper.BizRainHistoryMapper;
import com.github.pig.hydrological.service.IBizRainHistoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
@Service
public class BizRainHistoryServiceImpl extends ServiceImpl<BizRainHistoryMapper, BizRainHistory> implements IBizRainHistoryService {
	
	 private static final String ByDay = "0"; 
	 private static final String ByMonth = "1"; 
	 private static final String ByYear = "2";

	@Autowired
	private BizRainHistoryMapper bizRainHistoryMapper;
	
	@Override
	public List<BizRainHistory> selectList() {
		// TODO Auto-generated method stub
		return bizRainHistoryMapper.selectList();
	}

	@Override
	public List<BizRainHistory> getList(String type) {
		// TODO Auto-generated method stub
		
		List<BizRainHistory> list = null;
		
		if (!"".equals(type)||type!=null) {
			if (type.equals(ByDay)) {
				list = bizRainHistoryMapper.getByDay();
			}if (type.equals(ByMonth)) {
				list =  bizRainHistoryMapper.getByMonth();
			}if (type.equals(ByYear)) {
				list =  bizRainHistoryMapper.getByYear();
			}
		}
		return list;
	}

	@Override
	public int insertWater(BizRainHistory bizRainHistory) {
		// TODO Auto-generated method stub
		return bizRainHistoryMapper.insert(bizRainHistory);
	}

	@Override
	public void deleteWaterByPriKey(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		bizRainHistoryMapper.deleteWaterByPriKey(queryMap);
	}

	@Override
	public List<BizRainHistory> getListRe() {
		// TODO Auto-generated method stub
		return bizRainHistoryMapper.getListRe();
	}

}
