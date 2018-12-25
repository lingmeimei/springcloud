package com.github.pig.hydrological.thread;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.pig.hydrological.model.entity.BizWaterHistory;
import com.github.pig.hydrological.service.IBizWaterHistoryService;

/**
 * @author xlhua
 * @Description: 墒情数据处理线程
 * @date 2018-8-16 Copyright（C） 2018~2100 深圳市宏电技术股份有限公司
 */
public class ProcessWaterThread implements Runnable{

    private IBizWaterHistoryService iBizWaterHistoryService;

    public ProcessWaterThread(IBizWaterHistoryService iBizWaterHistoryService){
        this.iBizWaterHistoryService = iBizWaterHistoryService;
    }

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run() {
        log.info("**********************进入线程ssss****************************************");
        while (true) {
            List<BizWaterHistory> list = this.iBizWaterHistoryService.getList();
            if (list.size() > 0) {//存在
                list.forEach((BizWaterHistory bizWaterHistory) -> threadProcessing(bizWaterHistory));
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

    private void threadProcessing(BizWaterHistory bizWaterHistory) {
        try {

            int res =iBizWaterHistoryService.insertWater(bizWaterHistory);
            if (res == 0) {
                log.info("======插入失败！");
                try {
                    Thread.sleep(10 * 500); //获取数据为空，休眠5s
                } catch (InterruptedException e) {
                    log.error(null, e);
                }
                return;
            }else{
            	SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            	Map<String, Object> queryMap = new HashMap<String, Object>();
                queryMap.put("stcd", bizWaterHistory.getStcd());
                queryMap.put("tm", sdf.format(bizWaterHistory.getTm()));
                this.iBizWaterHistoryService.deleteWaterByPriKey(queryMap);
                log.info("编码为：" + bizWaterHistory.getStcd() + ",采集时间为：" + sdf.format(bizWaterHistory.getTm()) + "的地下水数据删除成功！");
                queryMap.clear();
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ProcessWaterThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
