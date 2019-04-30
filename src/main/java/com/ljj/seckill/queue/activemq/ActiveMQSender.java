package com.ljj.seckill.queue.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * @CLassName ActiveMQSender
 * @Description ActiveMQSender
 * @Author LeeJack
 * @Date 2019/4/30/030 22:25
 * @Version 1.0
 */
@Component
public class ActiveMQSender {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    /*
     * 发送消息，destination是发送到的队列，message是待发送的消息
     */
    public void sendChannelMess(Destination destination , final String message) {
        jmsTemplate.convertAndSend(destination , message);
    }
}
