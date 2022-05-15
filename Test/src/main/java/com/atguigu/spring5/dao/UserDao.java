package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/5/1 10:08
 **/
@Repository
public interface UserDao {
    //存钱
    public void addMoney();


    //取钱
    public void reduceMoney();
}
