package com.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description: 基于注解的SpringMVC
 * @Author hjc
 * @Date 2022/5/14 13:53
 * @Version V1.0
 **/

@Controller
public class HelloControllerAnno{
    @RequestMapping("/hello")
    public String hello2(Model model){
        model.addAttribute("msg","Hello,SpringMVC");
        return "hello";
    }
}
