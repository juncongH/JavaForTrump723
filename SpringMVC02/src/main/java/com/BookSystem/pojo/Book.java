package com.BookSystem.pojo;

/**
 * @ClassName Book
 * @Description: TODO
 * @Author hjc
 * @Date 2022/5/15 23:26
 * @Version V1.0
 **/
public class Book {
    private int id;
    private String bookname;
    private int booknum;
    private String author;

    public Book() {

    }

    public Book(int id, String bookname, int booknum, String author) {
        this.id = id;
        this.bookname = bookname;
        this.booknum = booknum;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBooknum() {
        return booknum;
    }

    public void setBooknum(int booknum) {
        this.booknum = booknum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
