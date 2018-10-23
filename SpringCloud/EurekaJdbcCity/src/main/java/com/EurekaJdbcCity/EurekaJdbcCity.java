package com.EurekaJdbcCity;

import org.mybatis.spring.annotation.MapperScan;
import com.EurekaJdbcCity.dao.CityDao;
import com.EurekaJdbcCity.domain.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Boot 应用启动类
 *
 * Created by caijun on 2018/10/16.
 */
@EnableEurekaClient
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.EurekaJdbcCity.dao")
public class EurekaJdbcCity {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(EurekaJdbcCity.class,args);
    }
}