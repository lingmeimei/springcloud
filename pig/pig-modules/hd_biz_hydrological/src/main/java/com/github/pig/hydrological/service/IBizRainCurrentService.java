package com.github.pig.hydrological.service;

import java.util.List;
import com.github.pig.hydrological.model.entity.BizRainCurrent;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
public interface IBizRainCurrentService extends IService<BizRainCurrent>{

	List<BizRainCurrent> selectList();

}
