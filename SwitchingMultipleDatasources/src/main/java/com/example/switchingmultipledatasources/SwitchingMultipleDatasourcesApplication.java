package com.example.switchingmultipledatasources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.switchingmultipledatasources.mapper")
public class SwitchingMultipleDatasourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwitchingMultipleDatasourcesApplication.class, args);
    }

}
