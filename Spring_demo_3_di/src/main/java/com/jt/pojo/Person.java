package com.jt.pojo;

import java.util.Map;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 16:09
 * ===================
 */
public class Person {
    private Map map;

    @Override
    public String toString() {
        return "Person{" +
                "map=" + map +
                '}';
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
