package com.example.mybatis_annotations_develop.service;

import com.example.mybatis_annotations_develop.bean.User;
import com.example.mybatis_annotations_develop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 14:12
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    public List<User> getAllUsersWithRole(Integer rid) {
        return userMapper.getAllUsersWithRole(rid);
    }
}
