package com.example.mybatis_annotations_develop.bean;

import lombok.Data;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 16:51
 */
@Data
public class Role {
    private Integer id;
    private String name;
    /**
     * 一对多映射，一个 role 有多个用户
     */
    private List<User> users;
}
