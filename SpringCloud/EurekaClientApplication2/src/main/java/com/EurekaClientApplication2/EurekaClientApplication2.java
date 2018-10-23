package com.EurekaClientApplication2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableDiscoveryClient

public class EurekaClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication2.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/")
    public String home() {
        return "hello world2 from port " + port;
        }

}