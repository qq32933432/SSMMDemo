package com.bxoon.service;

import com.baomidou.mybatisplus.service.IService;
import com.bxoon.entity.UserEntity;

/**
 * @author GuangxiZhong
 * 
 */
public interface UserServiceI extends IService<UserEntity> {
    void addUser(UserEntity userEntity);
}
