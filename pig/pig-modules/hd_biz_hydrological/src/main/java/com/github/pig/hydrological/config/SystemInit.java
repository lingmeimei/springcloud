package com.github.pig.hydrological.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.task.TaskExecutor;

import com.github.pig.hydrological.service.IBizRainHistoryService;
import com.github.pig.hydrological.service.IBizWaterHistoryService;
import com.github.pig.hydrological.thread.ProcessRainThread;
import com.github.pig.hydrological.thread.ProcessWaterThread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15927
 */
public class SystemInit implements CommandLineRunner {
    @Resource
    TaskExecutor taskExecutor;

	@Autowired
	IBizWaterHistoryService iBizWaterHistoryService;

	@Autowired
	IBizRainHistoryService iBizRainHistoryService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("******************进入线程run()********************");
//		ProcessWaterThread processWaterThread = new ProcessWaterThread(iBizWaterHistoryService);
//		taskExecutor.execute(processWaterThread);
//		ProcessRainThread processRainThread = new ProcessRainThread(iBizRainHistoryService);
//		taskExecutor.execute(processRainThread);
	}
    
}
