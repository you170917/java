package com.example.mybatis_pagehelper_demo.controller;

import com.example.mybatis_pagehelper_demo.bean.Role;
import com.example.mybatis_pagehelper_demo.mapper.RoleMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/11 15:03
 */
@RestController
public class Rolecontroller {
    @Autowired
    RoleMapper roleMapper;

    @GetMapping("/getAllRoles")
    public Page<Role> getAllRoles(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return roleMapper.getAllRoles();
    }
}
