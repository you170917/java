package com.example.mybatisplus.bean;

import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/27 16:07
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
