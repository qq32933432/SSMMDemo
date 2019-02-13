package com.bxoon.entity;

import com.baomidou.mybatisplus.annotations.KeySequence;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by ZGX99 on 2018/1/17.
 */
@TableName("T_USER")
@Data
@KeySequence("SEQ_USER")
public class UserEntity implements Serializable {

    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;
    private String userName;
    private String password;
    private String name;

}