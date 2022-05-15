package com.atguigu.spring5.bean;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 07:26
 **/

//部门类
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
