package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 06:59
 **/
public class UserService {

    //创建UserDao类型属性,生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add........");
        userDao.update();
    }

    //创建UserDao对象
//    UserDao userDao=new UserDaoImpl();
//    userDao.update();

}
