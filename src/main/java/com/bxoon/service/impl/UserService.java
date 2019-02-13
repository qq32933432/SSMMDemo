package com.bxoon.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bxoon.entity.UserEntity;
import com.bxoon.mapper.UserMapper;
import com.bxoon.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zgx
 */
@Service
public class UserService extends ServiceImpl<UserMapper, UserEntity> implements UserServiceI {

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(propagation= Propagation.REQUIRED,rollbackFor=Exception.class)
    public void addUser(UserEntity userEntity) {
        userMapper.insert(userEntity);
        System.out.println(1/0);
    }
}
