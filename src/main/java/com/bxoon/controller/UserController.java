package com.bxoon.controller;

import com.bxoon.entity.UserEntity;
import com.bxoon.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author GuangxiZhong
 */
@Controller
public class UserController {

    @Autowired
    UserServiceI userServiceI;

    @ResponseBody
    @RequestMapping("addUser")
    public String addUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userServiceI.addUser(userEntity);
        return "OK";
    }
}
