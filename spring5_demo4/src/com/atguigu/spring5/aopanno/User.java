package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 23:14
 **/

//被增强的类
@Component
public class User {

    public void add() {
//        int i=10/0;
        System.out.println("add......");
    }
}
