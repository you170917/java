package com.example.cachedemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class CachedemoApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void test01(){
        stringRedisTemplate.opsForValue().append("you", "你好！");
        String string = stringRedisTemplate.opsForValue().get("you");
        System.out.println(string);
    }

}
