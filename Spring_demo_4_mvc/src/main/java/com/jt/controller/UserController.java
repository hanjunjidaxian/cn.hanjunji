package com.jt.controller;

import com.jt.pojo.User;
import com.jt.service.UserService;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 16:35
 * ===================
 */
public class UserController {

    // Spring容器负责注入dao 面向接口编程
    private UserService userService;
    private User user;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addUser(){
        userService.addUser(user);
    }

}
