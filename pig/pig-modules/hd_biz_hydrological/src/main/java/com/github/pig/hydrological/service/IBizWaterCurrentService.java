package com.github.pig.hydrological.service;

import java.util.List;
import com.github.pig.hydrological.model.entity.BizWaterCurrent;
import com.baomidou.mybatisplus.service.IService;

public interface IBizWaterCurrentService extends IService<BizWaterCurrent>{

	List<BizWaterCurrent> selectList();
}
