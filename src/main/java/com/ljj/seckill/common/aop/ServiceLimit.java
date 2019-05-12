package com.ljj.seckill.common.aop;

import java.lang.annotation.*;

/**
 * @CLassName ServiceLimit
 * @Description 自定义注解  限流
 * @Author LeeJack
 * @Date 2019/4/30/030 18:01
 * @Version 1.0
 */
@Target({ElementType.PARAMETER , ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceLimit {
    String description() default "";
}
