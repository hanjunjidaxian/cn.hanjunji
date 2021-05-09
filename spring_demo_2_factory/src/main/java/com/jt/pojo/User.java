package com.jt.pojo;

/**
 * ===================
 *
 * @author 韩俊吉
 * @date 2021/5/9 14:28
 * ===================
 */
public class User {
    private String connection;
    //1.实例化对象
    public User() {
        System.out.println("创建对象");
    }
    //2. 初始化方法
    public void init(){
        this.connection = "赋值数据源连接";
        System.out.println(this.connection);
    }
    //3. 用户调用方法
    public void say(){
        System.out.println("我是用户信息");
    }
    //4. 销毁方法
    public void destroy(){
        this.connection = null;
        System.out.println("释放资源"+this.connection+"~~~~~~");
    }
}
