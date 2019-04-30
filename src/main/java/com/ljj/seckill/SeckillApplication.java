package com.ljj.seckill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LeeJack
 * @Description: 启动类
 * @Param
 * @return
 * @Date 23:12 2019/4/30/030
 * <p>
 * API接口测试：http://localhost:8080/seckill/swagger-ui.html
 * 跑之前 一定要看文库：https://gitee.com/52itstyle/spring-boot-seckill/wikis
 */
@SpringBootApplication
public class SeckillApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(SeckillApplication.class);

    /**
     * 1. 数据库乐观锁；2. 基于Redis的分布式锁；3. 基于ZooKeeper的分布式锁
     * 4. redis 订阅监听；5.kafka消息队列
     * 启动前 请配置application.properties中相关redis、zk以及kafka相关地址
     */
    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class , args);
        LOGGER.info("项目启动 ");
    }

}
