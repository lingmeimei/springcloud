package com.github.pig.hydrological.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pig.hydrological.service.IBizRainCurrentService;
import com.github.pig.hydrological.model.entity.BizRainCurrent;
import com.hongdian.util.RespRes;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chengpan
 * @since 2018-10-16
 */
@Controller
@RequestMapping("/RainCurrent")
public class BizRainCurrentController extends BaseController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IBizRainCurrentService ibizRainCurrentService;
	
	@RequestMapping("/getRainCurrentList")
    @ResponseBody
    public RespRes findList(HttpServletRequest request) {
        
        List<BizRainCurrent> result = ibizRainCurrentService.selectList();
        RespRes respRes = new RespRes();
        respRes.setCode(RespRes.CODE200);
        respRes.setData(result);
        return respRes;
    }
}

