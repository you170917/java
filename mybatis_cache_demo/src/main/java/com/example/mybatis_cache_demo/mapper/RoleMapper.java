package com.example.mybatis_cache_demo.mapper;

import com.example.mybatis_cache_demo.bean.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/10 19:00
 */
public interface RoleMapper {

    @Select("select * from roles")
    List<Role> getAllRoles();

    @Select("select * from roles where id =#{id}")
    Role getRoleById(Integer id);
}
