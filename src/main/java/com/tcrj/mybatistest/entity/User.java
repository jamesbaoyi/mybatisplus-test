package com.tcrj.mybatistest.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("sys_user")
public class User implements Serializable {

    private String userName;

    private String password;

    @TableId(value = "user_id", type = IdType.AUTO)
    private String userId;

}
