package com.example.testdemo.controller;

import com.example.testdemo.bean.Role;
import com.example.testdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/29 15:23
 */
@RestController
public class TestController {

    @Autowired
    RoleService roleService;

    @GetMapping("/getRoles")
    public List<Role> getAllRole(){
       return roleService.getAllRole();
    }
}
