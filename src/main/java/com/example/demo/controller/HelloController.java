package com.example.demo.controller;

import com.example.demo.domain.BookBean;
import com.example.demo.domain.LearnResouce;
import com.example.demo.service.LearnResouceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Value("${com.name}")
    private String name;

    @Autowired
    private BookBean bookBean;

    @Autowired
    private LearnResouceService learnResouceService;

    @RequestMapping("/index")
    public String test(){
        bookBean.setBookId("00011");
        bookBean.setBookName("kitty");
        return bookBean.getBookId()+bookBean.getBookName();
    }

    @RequestMapping("/he")
    public String index(){
        return name;
    }

    @RequestMapping("/learn")
    public ModelAndView index1(){
        List<LearnResouce> learnList =learnResouceService.getList();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
}

