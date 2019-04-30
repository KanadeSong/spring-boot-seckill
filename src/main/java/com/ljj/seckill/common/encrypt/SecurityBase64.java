package com.ljj.seckill.common.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;

/**
 * @CLassName SecurityBase64
 * @Description Base64 也会经常用作一个简单的“加密”来保护某些数据，而真正的加密通常都比较繁琐。
 * @Author LeeJack
 * @Date 2019/4/30/030 19:13
 * @Version 1.0
 */
public class SecurityBase64 {
    // 加密
    public String getBase64(String str) {
        byte[] b = null;
        String s = null;
        try {
            b = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (b != null) {
            s = new BASE64Encoder().encode(b);
        }
        return s;
    }

    // 解密
    public String getFromBase64(String s) {
        byte[] b = null;
        String result = null;
        if (s != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                b = decoder.decodeBuffer(s);
                result = new String(b , "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String args[]) {
        SecurityBase64 b6 = new SecurityBase64();
        System.out.println(b6.getBase64("I Love You"));//加密
        System.out.println(b6.getFromBase64(b6.getBase64("ILoveYou")));//解密
    }

}
