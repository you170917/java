package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.bean.Employee;
import com.example.mybatisplus.bean.User;
import com.example.mybatisplus.mapper.EmployeeMapper;
import com.example.mybatisplus.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    EmployeeMapper employeeMapper;

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

    /**
     * 获取所有用户
     */
    @Test
    void selectTest01(){
        List<Employee> employees = employeeMapper.selectList(null);
        employees.forEach(System.out::println);
    }

    /**
     * 根据指定条件 查询符合条件的用户 (selectList传参数的查询形式)
     * 使用 QueryWrapper.eq 方法，查询最高学历为硕士的用户
     */
    @Test
    void selectAllTest(){
        QueryWrapper<Employee> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tiptopDegree", "硕士");
        List<Employee> employees = employeeMapper.selectList(queryWrapper);
        employees.forEach(System.out::println);
    }

    /**
     * 根据 id 查询指定用户
     */
    @Test
    void selectById(){
        Employee employee = employeeMapper.selectById(1);
        System.out.println(employee);
    }

    /**
     * 根据 id 批量查询用户
     */
    @Test
    void selectByIds(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Employee> employees = employeeMapper.selectBatchIds(list);
        employees.forEach(System.out::println);
    }

    /**
     * 查询所有用户并分页
     */
    @Test
    void selectPage(){
        Page<Employee> page = new Page<>(1, 10);
        IPage<Employee> employeeIPage = employeeMapper.selectPage(page, null);
        System.out.println("=============           =======================");
        System.out.println("总记录数："+ employeeIPage.getTotal());
        System.out.println("总页数："+ employeeIPage.getPages());
        System.out.println(" --------------------            ----------------------");
        List<Employee> records = employeeIPage.getRecords();
        records.forEach(System.out::println);
    }
}
