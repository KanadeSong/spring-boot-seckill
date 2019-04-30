package com.ljj.seckill.common.dynamicquery;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CLassName NativeQueryResultEntity
 * @Description TODO
 * @Author LeeJack
 * @Date 2019/4/30/030 18:34
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NativeQueryResultEntity {
}
