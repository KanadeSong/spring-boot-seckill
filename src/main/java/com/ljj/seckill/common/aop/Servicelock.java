package com.ljj.seckill.common.aop;

import java.lang.annotation.*;

/**
 * @CLassName Servicelock
 * @Description 自定义注解 同步锁
 * @Author LeeJack
 * @Date 2019/4/30/030 18:07
 * @Version 1.0
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Servicelock {
    String description()  default "";
}
