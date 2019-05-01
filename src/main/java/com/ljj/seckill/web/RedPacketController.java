package com.ljj.seckill.web;

import com.ljj.seckill.common.entity.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName RedPacketController
 * @Description TODO
 * @Author LeeJack
 * @Date 2019/4/30/030 23:08
 * @Version 1.0
 */
@Api(tags = "抢红包")
@RestController
@RequestMapping("/redPacket")
public class RedPacketController {

    private static final Logger logger = LoggerFactory.getLogger(RedPacketController.class);


    @ApiOperation(value = "抢红包一(最low实现)", nickname = "科帮网")
    @PostMapping("/start")
    public static Result start(long seckillId) {
        logger.info("抢红包");
        return Result.ok();
    }
}
