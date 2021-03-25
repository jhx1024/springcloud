package com.zl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/nacos/{id}")
    public String getProvider(@PathVariable("id") String id){
        return "Nacos registry, serverPort: " + serverPort +"\t id" +id;
    }
}
