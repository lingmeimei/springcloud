//package com.hongdian.controller;
//
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
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
//import com.baomidou.mybatisplus.plugins.Page;
//import com.github.pig.hydrological.model.entity.BizWaterHistory;
//import com.github.pig.hydrological.service.IBizWaterHistoryService;
//import com.hongdian.util.RespRes;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author liuchong
// * @since 2018-09-21
// */
//@Controller
//@RequestMapping("/waterHistory")
//public class BizWaterHistoryController extends BaseController{
//
//	Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private IBizWaterHistoryService iBizWaterHistoryService;
//
//	@RequestMapping("/getWaterHistoryList")
//    @ResponseBody
//    public RespRes findList(HttpServletRequest request,Integer page, Integer rows) {
////   	 String stcd = request.getParameter("stcd");//国家测站号
////      String stnm = request.getParameter("stnm");//站点名称
//
//   	Page<BizWaterHistory> pg = new Page(page,rows);
//   	Map<String, Object> queryMap = new HashMap<String, Object>();
////   	queryMap.put("stcd", stcd);
////     queryMap.put("stnm", stnm);
//
//   	Page<BizWaterHistory> result = iBizWaterHistoryService.selectList(pg,queryMap);
//   	RespRes respRes = new RespRes();
//    respRes.setCode(RespRes.CODE200);
//    respRes.setData(result);
//    return respRes;
//    }
//
//
//}
//
