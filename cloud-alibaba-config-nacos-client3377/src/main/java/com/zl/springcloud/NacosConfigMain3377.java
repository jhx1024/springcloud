package com.zl.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //通过 Spring Cloud 原生注解 @EnableDiscoveryClient 开启服务注册发现功能
public class NacosConfigMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3377.class,args);
    }
}
