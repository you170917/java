package com.example.mybatis_pagehelper_demo.mapper;

import com.example.mybatis_pagehelper_demo.bean.Role;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Select;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/11 15:02
 */
public interface RoleMapper {

    @Select("select * from role")
    Page<Role> getAllRoles();
}
