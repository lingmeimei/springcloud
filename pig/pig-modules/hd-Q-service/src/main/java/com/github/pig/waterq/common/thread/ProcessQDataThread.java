package com.github.pig.waterq.common.thread;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pig.waterq.common.util.NetUtil;
import com.github.pig.waterq.common.util.RespRes;
import com.github.pig.waterq.model.entity.WpChannelWaterSync;
import com.github.pig.waterq.service.WpChannelWaterSyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/**
 * @author xlhua
 * @Description: 流量数据处理线程
 * @date 2018-9-13 Copyright（C） 2018~2100 深圳市宏电技术股份有限公司
 */
public class ProcessQDataThread implements Runnable{

    private String qPreInsertUrl;

    WpChannelWaterSyncService wpChannelWaterSyncService;

    public ProcessQDataThread(WpChannelWaterSyncService wpChannelWaterSyncService,String qPreInsertUrl){
        this.wpChannelWaterSyncService = wpChannelWaterSyncService;
        this.qPreInsertUrl = qPreInsertUrl;
    }

    private Logger log = LoggerFactory.getLogger(this.getClass());
    private final ObjectMapper objectMapper = new ObjectMapper();//json对象转成java bean

    @Override
    public void run(){
        log.info("**********************进入线程qqqqq****************************************");
        while (true) {
            List<WpChannelWaterSync> qList =  wpChannelWaterSyncService.selectList(new EntityWrapper<>());
            qList.forEach((WpChannelWaterSync q) -> threadProcessing(q));
//            Wrapper<WrMpQR1> ew = new EntityWrapper<WrMpQR1>();
//            List<WrMpQR1> list = wrMpQR1Service.selectList(ew);
//            if (list.size() > 0) {//存在
//                list.forEach((WrMpQR1 wrMpQR1) -> threadProcessing(wrMpQR1));
//            }else{
//                try {
//                    Thread.sleep(10 * 1000); //获取数据为空，休眠10s
//                } catch (InterruptedException e) {
//                    log.error(null, e);
//                }
//                log.info("======ProcessQDataThread获取数据为空！");
//            }
        }
    }

    private void threadProcessing(WpChannelWaterSync q) {
        try {
//            log.info("正在处理数据STCD="+q.getStcd()+",TM="+q.getTm());
            String grwJson = objectMapper.writeValueAsString(q);
            if (grwJson.equals("[]") || StringUtils.isEmpty(grwJson)) {
                log.info("======获取流量json为空！");
                try {
                    Thread.sleep(10 * 100); //获取数据为空，休眠10s
                } catch (InterruptedException e) {
                    log.error(null, e);
                }
                return;
            }
            log.info("q == " + grwJson);
            Map<String, String> paramMap = new HashMap<String, String>();

            paramMap.put("jsonStr", grwJson);
            String jsonStr = NetUtil.getJsonFromUrl(qPreInsertUrl, paramMap);
            RespRes obj;
            obj = objectMapper.readValue(jsonStr, RespRes.class);
            if (obj.equals("[]") || StringUtils.isEmpty(obj)) {
                log.info("======获取接口返回的json为空！");
                try {
                    Thread.sleep(10 * 500); //获取数据为空，休眠5s
                } catch (InterruptedException e) {
                    log.error(null, e);
                }
                return;
            }
            Map<String, Object> objMap = new HashMap<String, Object>();
            objMap =  (Map<String, Object>) obj.getData();
            SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if ("200".equals(obj.getCode())) {//200表示返回目标库插入成功记录，则再本地调用删除操作
//                Map<String, Object> queryMap = new HashMap<String, Object>();
//                queryMap.put("mpCd", wrMpQR1.getMpCd());
//                queryMap.put("tm", sdf.format(wrMpQR1.getTm()));
//                wrMpQR1Service.deleteWrMpQR1ByPriKey(queryMap);
//                log.info("编码为：" + q.getStcd() + ",采集时间为：" + sdf.format(q.getTm()) + "的地下水数据删除成功！");
//                queryMap.clear();
            } else {
                log.info("*********************  Error  *****************编码为：" + q.getStcd() + ",采集时间为：" + sdf.format(q.getTm()) + "的数据失败！");
            }
            paramMap.clear();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ProcessQDataThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
