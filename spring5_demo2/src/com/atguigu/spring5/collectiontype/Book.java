package com.atguigu.spring5.collectiontype;

import java.util.List;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/6 09:18
 **/
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
