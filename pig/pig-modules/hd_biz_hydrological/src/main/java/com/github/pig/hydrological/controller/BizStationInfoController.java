//package com.github.pig.hydrological.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import com.github.pig.common.web.BaseController;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.github.pig.hydrological.model.entity.BizStationInfo;
//import com.github.pig.hydrological.service.IBizStationInfoService;
//import com.hongdian.util.RespRes;
//
//@Controller
//@RequestMapping("/StationInfo")
//public class BizStationInfoController extends BaseController{
//
//	Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    IBizStationInfoService iBizStaionInfoService;
//
//	@RequestMapping("/getStationInfoList")
//    @ResponseBody
//    public RespRes findList(HttpServletRequest request) {
//
//        List<BizStationInfo> result = iBizStaionInfoService.selectList();
//        RespRes respRes = new RespRes();
//        respRes.setCode(RespRes.CODE200);
//        respRes.setData(result);
//        return respRes;
//    }
//
//
//}
