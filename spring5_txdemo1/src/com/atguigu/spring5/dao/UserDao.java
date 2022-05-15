package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 13:38
 **/
@Repository
public interface UserDao {

    //存钱
    public void addMoney();

    //模拟异常
    int i = 10 / 0;

    //取钱
    public void reduceMoney();
}
