package com.jt.pojo;

import com.jt.dao.Userdao;

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
