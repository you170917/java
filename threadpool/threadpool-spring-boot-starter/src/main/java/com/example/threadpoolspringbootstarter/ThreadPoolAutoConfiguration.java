package com.example.threadpoolspringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/29 9:59
 */
@Configuration
public class ThreadPoolAutoConfiguration {

    @Bean
    @ConditionalOnClass(ThreadPoolExecutor.class)
    public ThreadPoolExecutor myThreadPool(){
        return new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
    }
}
