package com.example.mybatis_cache_demo;

import com.example.mybatis_cache_demo.bean.Role;
import com.example.mybatis_cache_demo.mapper.RoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class MybatisCacheDemoApplicationTests {

    @Autowired
    RoleMapper roleMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        List<Role> allRoles = roleMapper.getAllRoles();
        allRoles.forEach(System.out::println);
    }

    @Test
    @Transactional
    public void test2(){
        System.out.println(roleMapper.getRoleById(1));
        System.out.println(roleMapper.getRoleById(1));
        System.out.println(roleMapper.getRoleById(1));
    }

}
