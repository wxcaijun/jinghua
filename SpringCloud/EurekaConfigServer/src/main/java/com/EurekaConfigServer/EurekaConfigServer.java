package com.EurekaConfigServer;

/**
 * Hello world!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableConfigServer
@SpringBootApplication

public class EurekaConfigServer 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaConfigServer.class, args);
    }
}
