package com.atguigu.spring5.autowire;

/**
 * @ClassName emp
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 16:02
 **/
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }
}
