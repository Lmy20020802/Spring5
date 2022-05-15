package com.atguigu.spring5.collectiontype;

/**
 * @ClassName Course
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 09:06
 **/
//课程类
public class Course {

    private String cname;//课程名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
