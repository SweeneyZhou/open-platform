package com.example.openplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.openplatform.mapper")
public class OpenPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenPlatformApplication.class, args);
    }

}
