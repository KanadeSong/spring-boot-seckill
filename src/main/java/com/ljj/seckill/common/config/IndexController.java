package com.ljj.seckill.common.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @CLassName IndexController
 * @Description 通用访问拦截匹配
 * @Author LeeJack
 * @Date 2019/4/30/030 18:12
 * @Version 1.0
 */
@Controller
public class IndexController {

    /**
     * @return java.lang.String
     * @Description: 页面跳转
     * @Param [url]
     * @author LeeJack
     * @Date 18:14 2019/4/30/030
     */
    @RequestMapping("{url}.shtml")
    public String page(@PathVariable("url") String url) {
        return url;
    }

    /**
     * @return java.lang.String
     * @Description: 页面跳转(二级目录)
     * @Param [module , url]
     * @author LeeJack
     * @Date 18:16 2019/4/30/030
     */
    @RequestMapping("{module}/{url}.shtml")
    public String page(@PathVariable("module") String module , @PathVariable("url") String url) {
        return module + "/" + url;
    }

}
