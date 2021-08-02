package com.example.cachedemo.mapper;

import com.example.cachedemo.bean.User;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/2 18:45
 */
public interface UserMapper {
    List<User> getAllUsers();
}
