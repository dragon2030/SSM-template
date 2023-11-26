package com.bigDragon.task;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: bigDragon
 * @create: 2023/11/26
 * @Description:
 */
//@Component
public class TestThreadTask {
    
//    @Scheduled(cron = "0/10 * * * * ? ")
    public void taskCycle(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("spring定时任务执行 "+simpleDateFormat.format(new Date()));
    }
}
