package com.BookSystem.controller;

import com.BookSystem.pojo.Book;
import com.BookSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName BookController
 * @Description: 调用service层
 * @Author hjc
 * @Date 2022/5/16 14:25
 * @Version V1.0
 **/

@Controller
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbook")
    public String list(Model model){
        List<Book> list=bookService.selectAllBook();
        model.addAttribute("list",list);
        return "allbook";
    }

}
