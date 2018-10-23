package com.EurekaConfigClient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope

public class EurekaConfigClient2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClient2.class, args);
    }
    
    @Value("${hello}")
    String hello;
    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }
}
