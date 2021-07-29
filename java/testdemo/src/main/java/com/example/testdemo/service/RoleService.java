package com.example.testdemo.service;

import com.example.testdemo.bean.Role;
import com.example.testdemo.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/29 15:59
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRole() {
        return roleMapper.getAllRole();
    }
}
