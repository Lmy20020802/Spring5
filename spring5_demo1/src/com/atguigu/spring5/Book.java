package com.atguigu.spring5;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/5 23:35
 **/
/*
演示使用set方法进行注入属性
 */
public class Book {

    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo() {
        System.out.println("bname:" + bname);
        System.out.println("bauthor:" + bauthor);
        System.out.println("address:" + address);
    }
}
