package com.jt;

import com.jt.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 17:21
 * ===================
 */
public class TestSpring {

    @Test
    public void testSpringMVC(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        UserController userController = (UserController) context.getBean("userController");
        userController.addUser();
    }

}
