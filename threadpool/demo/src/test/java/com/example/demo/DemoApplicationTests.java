package com.example.demo;

import com.example.threadpoolspringbootstarter.ThreadpoolSpringBootStarterApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 一定要在注解 @SpringBootTest 中添加参数 classes = ThreadpoolSpringBootStarterApplication.class
 * 这表明了，本次我们测试的项目是 ThreadpoolSpringBootStarterApplication 类所在的项目。
 */
@SpringBootTest(classes = ThreadpoolSpringBootStarterApplication.class)
public class DemoApplicationTests {

    @Autowired
    private ThreadPoolExecutor myThreadPool;

    @Test
    void contextLoads() {
        System.out.println(myThreadPool.getCorePoolSize());
    }

}
