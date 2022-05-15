package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName PersonProxy
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 07:40
 **/
@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("Person Before.....");
    }
}
