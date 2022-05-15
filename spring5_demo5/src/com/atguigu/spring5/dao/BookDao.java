package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/7 08:42
 **/
@Repository
public interface BookDao {

    //添加的方法
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
