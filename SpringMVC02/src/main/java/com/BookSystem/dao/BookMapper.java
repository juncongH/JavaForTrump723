package com.BookSystem.dao;

import com.BookSystem.pojo.Book;

import java.util.List;

/**
 * @ClassName BookMapper
 * @Description: TODO
 * @Author hjc
 * @Date 2022/5/16 10:00
 * @Version V1.0
 **/
public interface BookMapper {
    int addBook(Book book);
    int deleteBook(int id);
    int updateBook(Book book);
    Book selectBook(int id);
    List<Book> selectAllBook();
}
