package com.ljj.seckill.queue.disruptor;

import java.io.Serializable;

/**
 * @CLassName SeckillEvent
 * @Description 事件对象（秒杀事件
 * @Author LeeJack
 * @Date 2019/4/30/030 22:50
 * @Version 1.0
 */
public class SeckillEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    private long seckillId;
    private long userId;

    public SeckillEvent() {

    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
