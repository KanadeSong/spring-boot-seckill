package com.ljj.seckill.queue.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @CLassName RedisSender
 * @Description 生产者
 * @Author LeeJack
 * @Date 2019/4/30/030 23:05
 * @Version 1.0
 */
@Service
public class RedisSender {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    //向通道发送消息的方法
    public void sendChannelMess(String channel, String message) {
        stringRedisTemplate.convertAndSend(channel, message);
    }
}
