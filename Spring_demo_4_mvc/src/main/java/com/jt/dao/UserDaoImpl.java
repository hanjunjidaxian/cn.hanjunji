package com.jt.dao;

import com.jt.pojo.User;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 16:29
 * ===================
 */
public class UserDaoImpl implements Userdao {

    @Override
    public void addUser(User user) {
        System.out.println("添加用户:"+user);
    }
}
