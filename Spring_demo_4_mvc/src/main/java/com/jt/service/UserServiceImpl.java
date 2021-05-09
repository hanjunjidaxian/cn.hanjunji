package com.jt.service;

import com.jt.dao.Userdao;
import com.jt.pojo.User;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 16:31
 * ===================
 */
public class UserServiceImpl implements UserService{
    private Userdao userdao;// 基于Spring注入dao 面向接口编程

    public void setUserdao(Userdao userdao) {
        this.userdao = userdao;
    }

    @Override
    public void addUser(User user) {
        userdao.addUser(user);
    }
}
