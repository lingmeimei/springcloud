package com.github.pig.hydrological.service;

import java.util.List;

import com.github.pig.hydrological.model.entity.BizStationInfo;
import com.baomidou.mybatisplus.service.IService;

public interface IBizStationInfoService extends IService<BizStationInfo>{

	List<BizStationInfo> selectList();
	
}
