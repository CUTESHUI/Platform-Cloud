package com.shui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.shui.dao")
@SpringBootApplication
public class PlatformQuestionApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformQuestionApplication.class, args);
    }

}
