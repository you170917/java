package com.example.mybatis_annotations_develop.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 14:09
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String nickname;
    private String password;
    private Boolean enabled;
    private String email;
    private String userface;
    private Date regTime;
}
