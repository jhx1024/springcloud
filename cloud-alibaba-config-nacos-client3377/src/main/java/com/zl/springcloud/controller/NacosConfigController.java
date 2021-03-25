package com.zl.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 动态刷新配置，即动态修改Nacos配置中心配置内容，可读取到最新修改的配置内容
public class NacosConfigController {

    @Value("${config.info}")
    private  String configInfo;

    @GetMapping(value = "/nacos/config/info")
    public String getConfigInfo(){
        return  "Test Nacos config " + configInfo;
    }
}
