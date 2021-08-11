package com.example.mybatis_cache_demo.service;

import com.example.mybatis_cache_demo.bean.Role;
import com.example.mybatis_cache_demo.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/10 19:01
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    @Transactional
    public Role getRoleById(Integer id) {
        return roleMapper.getRoleById(id);
    }
}
