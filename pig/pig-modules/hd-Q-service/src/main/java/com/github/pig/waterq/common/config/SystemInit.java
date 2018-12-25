package com.github.pig.waterq.common.config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.annotation.Resource;

import com.github.pig.waterq.common.thread.ProcessQDataThread;
import com.github.pig.waterq.service.WpChannelWaterSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

/**
 *
 * @author xlhua
 * @Description:初始化綫程類
 * @date 2018-9-17 Copyright（C） 2018~2100 深圳市宏电技术股份有限公司
 */
@Component
public class SystemInit implements CommandLineRunner {

    @Resource
    TaskExecutor taskExecutor;

    @Value("${xlhua.q_api_insert_prefix_url}")
    private String qPreInsertUrl;

    @Autowired
    private WpChannelWaterSyncService wpChannelWaterSyncService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("进入线程初始化类。。。,访问的URL前缀为："+qPreInsertUrl);
//        ProcessQDataThread processQDataThread = new ProcessQDataThread(wpChannelWaterSyncService,qPreInsertUrl);
//        taskExecutor.execute(processQDataThread);//异步签署协议
    }
}
