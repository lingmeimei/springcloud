package com.github.pig.hydrological.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pig.hydrological.model.entity.BizRainCurrent;
import com.github.pig.hydrological.mapper.BizRainCurrentMapper;
import com.github.pig.hydrological.service.IBizRainCurrentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
@Service
public class BizRainCurrentServiceImpl extends ServiceImpl<BizRainCurrentMapper, BizRainCurrent> implements IBizRainCurrentService {

	@Autowired
	private BizRainCurrentMapper bizRainCurrentMapper;
    
	
	@Override
	public List<BizRainCurrent> selectList() {
		// TODO Auto-generated method stub
		return bizRainCurrentMapper.selectList();
	}

}
