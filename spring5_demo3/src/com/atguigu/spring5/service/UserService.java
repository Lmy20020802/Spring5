package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 17:27
 **/
//在注释里面value属性值可以省略不写
//默认值是类名称,首字母小写
//@Component(value = "userService")
//@Controller
//@Repository
@Service
public class UserService {

    @Value(value = "abc") //注入属性
    private String name;

    //定义Dao类型的属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired  //根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")  //根据名称进行注入
//    private UserDao userDao;

    //    @Resource //根据类型进行注入
    @Resource(name = "userDaoImpl1") //根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add......." + name);
        userDao.add();
    }

}
