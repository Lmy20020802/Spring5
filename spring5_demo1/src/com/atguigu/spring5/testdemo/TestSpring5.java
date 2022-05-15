package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring5
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/24 21:38
 **/
public class TestSpring5 {

    /*
    1、IOC 思想基于 IOC 容器完成，IOC 容器底层就是对象工厂
    2、Spring 提供 IOC 容器实现两种方式:(两个接口)
    (1)BeanFactory:IOC 容器基本实现，是 Spring 内部的使用接口，不提供开发人员进行使用 * 加载配置文件时候不会创建对象，在获取对象(使用)才去创建对象
    (2)ApplicationContext:BeanFactory 接口的子接口，提供更多更强大的功能，一般由开发人 员进行使用
* 加载配置文件时候就会把在配置文件对象进行创建
     */
    @Test
    public void testAdd() {

        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory context=new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        //1.加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.orderTest();
    }
}
