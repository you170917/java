package com.example.mybatis_annotations_develop.mapper;

import com.example.mybatis_annotations_develop.bean.Role;
import com.example.mybatis_annotations_develop.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 16:53
 */
public interface RoleMapper {

    @Select("select * from roles")
    List<Role> getAllRoles(Integer id);
}
