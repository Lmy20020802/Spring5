package com.atguigu.demowebflux.service;

import com.atguigu.demowebflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 23:13
 **/

//用户操作接口
public interface UserService {

    //根据id查询用户
    Mono<User> getUserById(int id);

    //查询所有用户
    Flux<User> getAllUser();

    //添加用户
    Mono<Void> setUserInfo(Mono<User> user);
}
