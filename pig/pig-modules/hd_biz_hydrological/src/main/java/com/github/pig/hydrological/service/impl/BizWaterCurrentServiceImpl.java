package com.github.pig.hydrological.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.hydrological.model.entity.BizWaterCurrent;
import com.github.pig.hydrological.mapper.BizWaterCurrentMapper;
import com.github.pig.hydrological.service.IBizWaterCurrentService;

@Service
public class BizWaterCurrentServiceImpl extends ServiceImpl<BizWaterCurrentMapper, BizWaterCurrent>implements IBizWaterCurrentService {

	@Autowired
	private BizWaterCurrentMapper bizWaterCurrentMapper;

	@Override
	public List<BizWaterCurrent> selectList() {
		// TODO Auto-generated method stub
		return bizWaterCurrentMapper.selectList();
	}

}
