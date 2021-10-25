package com.tcrj.mybatistest.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tcrj.mybatistest.entity.User;
import com.tcrj.mybatistest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.getUserById(1L);
    }

    public User selectById(Long id) {
        return userMapper.selectById(1L);
    }

    public IPage<User> getAll() {
        Page<User> userPage = new Page<>(0, 10);
        return userMapper.selectPage(userPage, null);
    }
}
