package com.atguigu.spring5.test;

import com.atguigu.spring5.config.TxConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 14:31
 **/
public class TestUser {

    @Nullable //方法参数可以为空
    private String bookName;

    @Test
    public void testAccount1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    //函数式风格创建对象,交给spring进行管理
    @Test
    public void testGenericApplicationContext() {
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2.调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());
        //3.获取在spring注册的对象
//        User user = (User) context.getBean("com.atguigu.spring5.test.User");
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
