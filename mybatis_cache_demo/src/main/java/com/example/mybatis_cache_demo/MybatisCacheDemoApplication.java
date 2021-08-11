package com.example.mybatis_cache_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching
@MapperScan(basePackages = "com.example.mybatis_cache_demo.mapper")
public class MybatisCacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisCacheDemoApplication.class, args);
    }

}
