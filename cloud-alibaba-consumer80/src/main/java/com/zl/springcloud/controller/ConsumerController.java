package com.zl.springcloud.controller;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;


    @GetMapping(value = "/consumer/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject(serverURL+"/provider/nacos/"+id,String.class);
    }

    public static void main(String[] args)
    {
        //这是加密方式
        String hashed = BCrypt.hashpw("123456", BCrypt.gensalt());
        System.out.println(hashed);

        //这是解密方式
        if (BCrypt.checkpw("123456", hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");
    }
}
