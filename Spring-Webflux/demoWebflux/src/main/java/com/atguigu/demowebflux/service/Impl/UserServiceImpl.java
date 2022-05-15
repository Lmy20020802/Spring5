package com.atguigu.demowebflux.service.Impl;

import com.atguigu.demowebflux.entity.User;
import com.atguigu.demowebflux.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 23:19
 **/
@Repository
public class UserServiceImpl implements UserService {

    //创建map集合存储数据
    private final Map<Integer,User> users=new HashMap<>();

    public UserServiceImpl(){
        this.users.put(1,new User("LMY","nan",19));
        this.users.put(2,new User("WTT","nv",24));
        this.users.put(3,new User("LJ","nv",19));
    }

    //根据id查询
    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    //查询多个用户
    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    //添加用户
    @Override
    public Mono<Void> setUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person->{
            //向map集合里放值
            int id = users.size() + 1;
            users.put(id,person);
        }).thenEmpty(Mono.empty());
    }
}
