package com.example.switchingmultipledatasources.service;

import com.example.switchingmultipledatasources.bean.VhrRole;
import com.example.switchingmultipledatasources.mapper.vhrmapper.VhrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/30 16:27
 */
@Service
public class VhrRoleService {

    @Autowired
    VhrMapper vhrMapper;

    public List<VhrRole> getAllRoles() {
        return vhrMapper.getAllRoles();
    }
}
