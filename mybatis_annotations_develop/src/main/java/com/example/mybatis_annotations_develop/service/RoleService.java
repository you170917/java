package com.example.mybatis_annotations_develop.service;

import com.example.mybatis_annotations_develop.bean.User;
import com.example.mybatis_annotations_develop.mapper.RoleMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 16:53
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;


}
