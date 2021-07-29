package com.example.testdemo;

import com.example.testdemo.bean.Role;
import com.example.testdemo.controller.TestController;
import com.example.testdemo.mapper.RoleMapper;
import com.example.testdemo.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestdemoApplicationTests {

    @Autowired
    RoleService roleService;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    TestController testController;

    @Test
    void test1(){
        List<Role> allRole = roleService.getAllRole();
        allRole.forEach(System.out::println);
    }
    @Test
    void test2(){
        List<Role> allRole = roleMapper.getAllRole();
        allRole.forEach(System.out::println);
    }
    @Test
    void test3(){
        List<Role> allRole = testController.getAllRole();
        allRole.forEach(System.out::println);
    }
}
