package com.example.switchingmultipledatasources.mapper.securitymapper;

import com.example.switchingmultipledatasources.bean.SecurityRole;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/30 16:26
 */
public interface SecurityMapper {
    List<SecurityRole> getAllRoles();
}
