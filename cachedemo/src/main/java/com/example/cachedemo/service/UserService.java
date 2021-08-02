package com.example.cachedemo.service;

import com.example.cachedemo.bean.User;
import com.example.cachedemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/2 18:45
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Cacheable(cacheNames = "users")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
