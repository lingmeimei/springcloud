package com.github.pig.hydrological.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pig.hydrological.model.entity.BizStationInfo;
import com.github.pig.hydrological.mapper.BizStationInfoMapper;
import com.github.pig.hydrological.service.IBizStationInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author tomzhang
 * Copyright（C） 2010~2020 深圳市宏电技术股份有限公司
 * @date 2018/11/2 16:08
 */
@Service
public class BizStationInfoServiceImpl extends ServiceImpl<BizStationInfoMapper,BizStationInfo>implements IBizStationInfoService {
    @Autowired
    BizStationInfoMapper bizStationInfoMapper;

    @Override
    public List<BizStationInfo> selectList() {
        // TODO Auto-generated method stub
        return bizStationInfoMapper.selectList();
    }
}
