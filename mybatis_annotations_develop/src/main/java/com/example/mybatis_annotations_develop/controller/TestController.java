package com.example.mybatis_annotations_develop.controller;

import com.example.mybatis_annotations_develop.bean.RespBean;
import com.example.mybatis_annotations_develop.bean.User;
import com.example.mybatis_annotations_develop.service.RoleService;
import com.example.mybatis_annotations_develop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 14:14
 */
@RestController
public class TestController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public RespBean addUser(@RequestBody User user){
        if (userService.addUser(user) == 1){
            return RespBean.ok("添加成功！");
        }
        return RespBean.error("添加失败！");
    }

    @PutMapping("/updateUser")
    public RespBean updateUser(@RequestBody User user){
        if (userService.updateUser(user) == 1){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

    @DeleteMapping("/deleteUser/{id}")
    public RespBean deleteUser(@PathVariable Integer id){
        if (userService.deleteUser(id) == 1){
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @GetMapping("/selectUserById/{id}")
    public User selectUserById(@PathVariable Integer id){
        return userService.selectUserById(id);
    }

    @GetMapping("/getAllUsersWithRole/{rid}")
    public List<User> getAllUsersWithRole(@PathVariable Integer rid){
        return userService.getAllUsersWithRole(rid);
    }
}
