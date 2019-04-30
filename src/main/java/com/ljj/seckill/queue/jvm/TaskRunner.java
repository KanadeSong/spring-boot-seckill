package com.ljj.seckill.queue.jvm;

import com.ljj.seckill.common.entity.SuccessKilled;
import com.ljj.seckill.service.ISeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @CLassName TaskRunner
 * @Description 消费秒杀队列
 * @Author LeeJack
 * @Date 2019/4/30/030 22:53
 * @Version 1.0
 */
@Component
public class TaskRunner implements ApplicationRunner {

    @Autowired
    private ISeckillService seckillService;

    @Override
    public void run(ApplicationArguments var) throws Exception{
        while(true){
            //进程内队列
            SuccessKilled kill = SeckillQueue.getMailQueue().consume();
            if(kill!=null){
                seckillService.startSeckil(kill.getSeckillId(), kill.getUserId());
            }
        }
    }
}
