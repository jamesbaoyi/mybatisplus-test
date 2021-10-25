package com.tcrj.mybatistest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tcrj.mybatistest.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getUserById(Long id);
}
