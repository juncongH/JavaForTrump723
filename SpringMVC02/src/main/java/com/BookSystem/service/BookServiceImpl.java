package com.BookSystem.service;

import com.BookSystem.dao.BookMapper;
import com.BookSystem.pojo.Book;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description: 写业务逻辑，service层调用dao层的方法，根据业务逻辑调用合适的方法使用
 * @Author hjc
 * @Date 2022/5/16 10:27
 * @Version V1.0
 **/
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book selectBook(int id) {
        return bookMapper.selectBook(id);
    }

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }
}
