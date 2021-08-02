package com.example.cachedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.example.cachedemo.mapper")
public class CachedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachedemoApplication.class, args);
    }

}
