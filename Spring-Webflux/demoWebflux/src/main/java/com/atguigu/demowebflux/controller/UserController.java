package com.atguigu.demowebflux.controller;

import com.atguigu.demowebflux.entity.User;
import com.atguigu.demowebflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 23:31
 **/
@RestController
public class UserController {

    //注入service
    @Autowired
    private UserService userService;

    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable int id){
        return userService.getUserById(id);
    }

    //查询所有
    @GetMapping("/user")
    public Flux<User> getUsers()
    {
        return userService.getAllUser();
    }

    //添加操作
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono=Mono.just(user);
        return userService.setUserInfo(userMono);
    }
}
