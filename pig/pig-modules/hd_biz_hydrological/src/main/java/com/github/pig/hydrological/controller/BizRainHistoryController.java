//package com.github.pig.hydrological.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import com.github.pig.common.web.BaseController;
//import com.github.pig.hydrological.model.entity.BizRainHistory;
//import com.github.pig.hydrological.service.IBizRainHistoryService;
//import com.hongdian.util.RespRes;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author chengpan
// * @since 2018-10-16
// */
//@Controller
//@RequestMapping("/rainHistory")
//public class BizRainHistoryController extends BaseController{
//
//	Logger logger = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private IBizRainHistoryService iBizRainHistoryService;
//
//	@RequestMapping("/getRainHistoryList")
//	@ResponseBody
//	public RespRes findList(){
//
//		List<BizRainHistory> result = iBizRainHistoryService.selectList();
//		RespRes respRes = new RespRes();
//        respRes.setCode(RespRes.CODE200);
//        respRes.setData(result);
//		return respRes;
//	}
//
//	@RequestMapping("/getRainHisListByTime")
//	@ResponseBody
//	public RespRes getList(HttpServletRequest request){
//
//		String type = request.getParameter("type");
//		List<BizRainHistory> result = iBizRainHistoryService.getList(type);
//		RespRes respRes = new RespRes();
//        respRes.setCode(RespRes.CODE200);
//        respRes.setData(result);
//		return respRes;
//	}
//}
//
