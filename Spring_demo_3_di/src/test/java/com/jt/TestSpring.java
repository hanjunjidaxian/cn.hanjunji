package com.jt;

import com.jt.pojo.Person;
import com.jt.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 15:19
 * ===================
 */
public class TestSpring {
    @Test
    public void testDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
        Person person = (Person) context.getBean("person");
        System.out.println(person.toString());
    }
}


