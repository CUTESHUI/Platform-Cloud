package com.shui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shui.dao")
@SpringBootApplication
public class PlatformChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformChannelApplication.class, args);
    }

}
