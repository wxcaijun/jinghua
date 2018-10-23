package com.EurekaFeign;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloWorldFeign {
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}