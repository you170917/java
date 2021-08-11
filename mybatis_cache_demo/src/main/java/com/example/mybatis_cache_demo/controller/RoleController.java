package com.example.mybatis_cache_demo.controller;

import com.example.mybatis_cache_demo.bean.Role;
import com.example.mybatis_cache_demo.service.RoleService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/10 19:01
 */
@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("/getRoleById/{id}")
    public Role getRoleById(@PathVariable Integer id){
        return roleService.getRoleById(id);
    }

//    public Role getRoleById()
}
