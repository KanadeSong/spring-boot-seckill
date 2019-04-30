package com.ljj.seckill.queue.disruptor;

import com.ljj.seckill.common.config.SpringUtil;
import com.ljj.seckill.service.ISeckillService;
import com.lmax.disruptor.EventHandler;

/**
 * @CLassName SeckillEventConsumer
 * @Description 消费者(秒杀处理器)
 * @Author LeeJack
 * @Date 2019/4/30/030 22:51
 * @Version 1.0
 */
public class SeckillEventConsumer implements EventHandler<SeckillEvent> {

    private ISeckillService seckillService = (ISeckillService) SpringUtil.getBean("seckillService");

    public void onEvent(SeckillEvent seckillEvent, long seq, boolean bool) throws Exception {
        seckillService.startSeckil(seckillEvent.getSeckillId(), seckillEvent.getUserId());
    }
}
