package com.ljj.seckill.queue.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * @CLassName SeckillEventFactory
 * @Description 事件生成工厂（用来初始化预分配事件对象）
 * @Author LeeJack
 * @Date 2019/4/30/030 22:52
 * @Version 1.0
 */
public class SeckillEventFactory implements EventFactory<SeckillEvent> {

    public SeckillEvent newInstance() {
        return new SeckillEvent();
    }
}
