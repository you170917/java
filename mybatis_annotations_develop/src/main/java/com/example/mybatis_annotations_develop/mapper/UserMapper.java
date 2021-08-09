package com.example.mybatis_annotations_develop.mapper;

import com.example.mybatis_annotations_develop.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/8/9 14:14
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> getAllUsers();

    /**
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into user(username, nickname, password, email) value(#{username}, #{nickname}, #{password}, #{email})")
    int addUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Update("update user set password=#{password} where id=#{id}")
    int updateUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @Delete("delete from user where id=#{id}")
    int deleteUser(Integer id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from user where id=#{id}")
    User selectUserById(Integer id);

    /**
     * 多表查询，这里不用@Results,直接运行
     * @param rid
     * @return
     */
    @Select("select u.* from user u, roles r, roles_user ru where u.id=ru.uid and r.id=ru.rid and r.id=#{rid}")
//    @Results(id = "UsersWithRole", value = {
////            @Result(id = true, column = "id", property = "id"),
////            @Result(column = "id", property = "id"),
////            @Result(column = "name", property = "name"),
////            @Result(column = "user", property = "user",
////            many = @Many(select = "com.example.mybatis_annotations_develop.mapper.RoleMapper.getAllRoles", fetchType= FetchType.EAGER))
////    })
    List<User> getAllUsersWithRole(Integer rid);
}
