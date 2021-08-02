package com.example.mybatisplus;

import com.example.mybatisplus.bean.User;
import com.example.mybatisplus.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void selectTest(){
        System.out.println("------ selectAll method test ------");
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);
    }

}
