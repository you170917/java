package com.example.switchingmultipledatasources.controller;

import com.example.switchingmultipledatasources.bean.SecurityRole;
import com.example.switchingmultipledatasources.bean.VhrRole;
import com.example.switchingmultipledatasources.service.SecurityRoleService;
import com.example.switchingmultipledatasources.service.VhrRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 爱吃西瓜的番茄酱
 * @version 1.0
 * @date 2021/7/30 17:11
 */
@RestController
public class TestController {

    @Autowired
    SecurityRoleService securityRoleService;

    @Autowired
    VhrRoleService vhrRoleService;

    @GetMapping("/getSecurityRoles")
    public List<SecurityRole> getAllRoles(){
        return securityRoleService.getAllRoles();
    }

    @GetMapping("/getVhrRoles")
    public List<VhrRole> getAllRoles2(){
        return vhrRoleService.getAllRoles();
    }
}
