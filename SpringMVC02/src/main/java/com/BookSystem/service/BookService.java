package com.BookSystem.service;

import com.BookSystem.pojo.Book;

import java.util.List;

/**
 * @ClassName BookService
 * @Description: TODO
 * @Author hjc
 * @Date 2022/5/16 10:25
 * @Version V1.0
 **/
public interface BookService {
    int addBook(Book book);
    int deleteBook(int id);
    int updateBook(Book book);
    Book selectBook(int id);
    List<Book> selectAllBook();
}
