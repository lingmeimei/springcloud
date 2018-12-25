//package com.github.pig.hydrological.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import com.github.pig.common.web.BaseController;
//import com.github.pig.hydrological.model.entity.BizWaterCurrent;
//import com.github.pig.hydrological.service.IBizWaterCurrentService;
//import com.hongdian.util.RespRes;
//
//@Controller
//@RequestMapping("/WaterCurrent")
//public class BizWaterCurrentController extends BaseController{
//
//	Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private IBizWaterCurrentService iBizWaterCurrentService;
//
//    @RequestMapping("/getWaterCurrentList")
//    @ResponseBody
//    public RespRes findList(HttpServletRequest request) {
//
//        List<BizWaterCurrent> bizWaterCurrent = iBizWaterCurrentService.selectList();
//        RespRes respRes = new RespRes();
//        respRes.setCode(RespRes.CODE200);
//        respRes.setData(bizWaterCurrent);
//        return respRes;
//    }
//
//}
//
