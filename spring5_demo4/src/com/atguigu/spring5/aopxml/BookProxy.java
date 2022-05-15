package com.atguigu.spring5.aopxml;

/**
 * @ClassName BookProxy
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 07:50
 **/
public class BookProxy {

    public void before() {
        System.out.println("before......");
    }

    public void after() {
        System.out.println("after......");
    }
}
