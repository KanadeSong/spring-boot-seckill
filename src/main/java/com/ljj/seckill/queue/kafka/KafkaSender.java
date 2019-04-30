package com.ljj.seckill.queue.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @CLassName KafkaSender
 * @Description 生产者
 * @Author LeeJack
 * @Date 2019/4/30/030 22:55
 * @Version 1.0
 */
@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * 发送消息到kafka
     */
    public void sendChannelMess(String channel, String message){
        kafkaTemplate.send(channel,message);
    }

}
