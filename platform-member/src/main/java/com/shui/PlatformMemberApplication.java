package com.shui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shui.dao")
@SpringBootApplication
public class PlatformMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformMemberApplication.class, args);
    }

}
