package com.ljj.seckill.web;

import com.ljj.seckill.common.entity.Result;
import com.ljj.seckill.service.ICreateHtmlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @CLassName CreateHtmlController
 * @Description TODO
 * @Author LeeJack
 * @Date 2019/4/30/030 23:08
 * @Version 1.0
 */
@Api(tags ="生成静态商品页")
@RestController
@RequestMapping("/createHtml")
public class CreateHtmlController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CreateHtmlController.class);

    @Autowired
    private ICreateHtmlService createHtmlService;

    @ApiOperation(value="生成静态商品页",nickname="科帮网")
    @PostMapping("/start")
    public Result start(){
        LOGGER.info("生成秒杀活动静态页");
        return createHtmlService.createAllHtml();
    }
}
