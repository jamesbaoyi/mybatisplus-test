package com.tcrj.mybatistest.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tcrj.mybatistest.entity.User;
import com.tcrj.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    private User getUserById() {
        return userService.getUserById(1L);
    }

    @GetMapping("/getAll")
    private IPage<User> getAll() {
        return userService.getAll();
    }

}
