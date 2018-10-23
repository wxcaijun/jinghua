package com.EurekaServerApplication2;

/**
 * EurekaServerApplication!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.Configuration;

@EnableEurekaServer
@EnableAutoConfiguration
@SpringBootApplication

public class EurekaServerApplication2 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaServerApplication2.class, args);
    }
}
