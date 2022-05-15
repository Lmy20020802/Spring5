package com.atguigu.spring5;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 19:10
 **/
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public String upDate(String id) {
        System.out.println("upDate方法执行了");
        return id;
    }
}
