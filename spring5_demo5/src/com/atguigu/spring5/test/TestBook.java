package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestBook
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 09:28
 **/
public class TestBook {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

            //添加
//            Book book=new Book();
//            book.setUserId("2");
//            book.setUsername("JavaScript");
//            book.setUstatus("a");
//            bookService.addBook(book);

        //修改
//        Book book=new Book();
//        book.setUserId("1");
//        book.setUsername("Java核心编程");
//        book.setUstatus("100");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteaBook("1");

        //查询表中数据的数量
//        System.out.println(bookService.findCount());

        //根据Id查询表数据
//        Book one = bookService.findOne("1");
//        System.out.println(one);

        //查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        //批量添加
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] o1={"2","JavaScript","a"};
//        Object[] o2={"3","MySql","b"};
//        Object[] o3={"4","c++","c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs=new ArrayList<>();
//        Object[] o2={"MySql","b","2"};
//        Object[] o3={"c++","c","3"};
//        Object[] o1={"JavaScript","a","4"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"2"};
        Object[] o2 = {"3"};
        Object[] o3 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用批量添加
        bookService.batchDelete(batchArgs);
    }
}
