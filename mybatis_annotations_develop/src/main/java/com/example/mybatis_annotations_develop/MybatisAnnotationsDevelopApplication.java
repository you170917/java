package com.example.mybatis_annotations_develop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mybatis_annotations_develop.mapper")
public class MybatisAnnotationsDevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisAnnotationsDevelopApplication.class, args);
    }

}
