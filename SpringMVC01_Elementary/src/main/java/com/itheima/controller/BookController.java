package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @time: 5/11/2022 23:08
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String bookName, Integer money){
        System.out.println("BookSave ... ");
        System.out.println("bookName ==> " + bookName);
        System.out.println("money ==> " + money);
        return "{'module':'book save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("BookDelete ...");
        return "{'module':'book delete'}";
    }
}
