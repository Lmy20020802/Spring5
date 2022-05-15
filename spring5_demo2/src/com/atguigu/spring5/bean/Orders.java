package com.atguigu.spring5.bean;

/**
 * @ClassName Orders
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 12:43
 **/
public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步:执行无参数构造对象bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步:调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步:执行初始化的方法");
    }

    //创建执行的销毁的方法
    public void destroyMethode() {
        System.out.println("第五步:执行销毁的方法");
    }
}
