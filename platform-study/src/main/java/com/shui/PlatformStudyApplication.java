package com.shui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@EnableDiscoveryClient
@MapperScan("com.shui.dao")
@SpringBootApplication
public class PlatformStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformStudyApplication.class, args);
    }

}
