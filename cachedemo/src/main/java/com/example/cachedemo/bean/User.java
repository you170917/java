package com.example.cachedemo.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/2 18:40
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
