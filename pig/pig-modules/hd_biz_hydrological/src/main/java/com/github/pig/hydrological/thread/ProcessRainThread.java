package com.github.pig.hydrological.thread;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.pig.hydrological.model.entity.BizRainHistory;
import com.github.pig.hydrological.service.IBizRainHistoryService;

/**
 * @author xlhua
 * @Description: 墒情数据处理线程
 * @date 2018-8-16 Copyright（C） 2018~2100 深圳市宏电技术股份有限公司
 */
public class ProcessRainThread implements Runnable{
	
    private IBizRainHistoryService iBizRainHistoryService;

    public ProcessRainThread(IBizRainHistoryService iBizRainHistoryService){
        this.iBizRainHistoryService = iBizRainHistoryService;
    }

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run() {
        log.info("**********************进入线程ssss****************************************");
        while (true) {
            List<BizRainHistory> list = this.iBizRainHistoryService.getListRe();
            if (list.size() > 0) {//存在
                list.forEach((BizRainHistory bizRainHistory) -> threadProcessing(bizRainHistory));
            }else{
                try {
                    Thread.sleep(10 * 1000); //获取数据为空，休眠10s
                } catch (InterruptedException e) {
                    log.error(null, e);
                }
                log.info("======ProcessWaterThread获取数据为空！");
            }
        }
    }

    private void threadProcessing(BizRainHistory bizRainHistory) {
        try {
            int res =iBizRainHistoryService.insertWater(bizRainHistory);
            if (res == 0) {
                log.info("===插入数据失败===");
                try {
                    Thread.sleep(10 * 500); //获取数据为空，休眠5s
                } catch (InterruptedException e) {
                    log.error(null, e);
                }
                return;
            } else{
            	  Map<String, Object> queryMap = new HashMap<String, Object>();
            	  SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                  queryMap.put("stcd", bizRainHistory.getStcd());
                  queryMap.put("tm", sdf.format(bizRainHistory.getTm()));
                  this.iBizRainHistoryService.deleteWaterByPriKey(queryMap);
                  log.info("编码为：" + bizRainHistory.getStcd() + ",采集时间为：" + sdf.format(bizRainHistory.getTm()) + "的地下水数据删除成功！");
                  queryMap.clear();
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ProcessRainThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
