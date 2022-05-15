package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringConfig
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 18:16
 **/
@Configuration //作为配置类 替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {

}
