package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @time: 6/11/2022 0:08
 */
@Controller
public class Address {

    // 普通参数
    @RequestMapping("/save1") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save1(@RequestParam("name") String bookName, Integer money){
        System.out.println("----------------------");
        System.out.println("bookName ==> " + bookName);
        System.out.println("money ==> " + money);
        return "{'module':'book save'}";
    }

    // pojo参数
    @RequestMapping("/save2") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save2(Book book){
        System.out.println("----------------------");
        System.out.println(book);
        return "{'module':'book save'}";
    }


    // 嵌套pojo参数
    @RequestMapping(value = "/save3") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save3(User user){
        System.out.println("----------------------");
        System.out.println(user);
        return "{'module':'book save'}";
    }


    // 数组参数
    @RequestMapping("/save4") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save4(@RequestParam("key") String[] args){
        System.out.println("----------------------");
        System.out.println(Arrays.toString(args));
        return "{'module':'book save'}";
    }


    // 集合参数
    @RequestMapping("/save5") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save5(@RequestParam List<String> list){
        System.out.println("----------------------");
        System.out.println(list);
        return "{'module':'book save'}";
    }

    // 普通json
    @RequestMapping(value = "/save6", method = RequestMethod.PUT)
    @ResponseBody
    public String save6(@RequestBody List<String> json) {
        System.out.println("----------------------");
        System.out.println(json);
        return "{'module':'book save'}";
    }

    // pojo json
    @RequestMapping(value = "/save7", method = RequestMethod.PUT)
    @ResponseBody
    public String save7(@RequestBody User user) {
        System.out.println("----------------------");
        System.out.println(user);
        return "{'module':'book save'}";
    }

    // pojo json集合
    @RequestMapping("/save8")
    @ResponseBody
    public String save7(@RequestBody List<User> user) {
        System.out.println("----------------------");
        System.out.println(user);
        return "{'module':'book save'}";
    }

    @RequestMapping("/save9")
    @ResponseBody
    public String save9(Date date, // 默认格式是yyyy/MM/dd 或者 yyyy/MM/dd hh:mm:ss
                        @DateTimeFormat(pattern = "hh:mm:ss") Date dateTime,
                        @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                        @DateTimeFormat(pattern = "yyyy$MM$dd hh:mm:ss") Date date2) {
        System.out.println("----------------------");
        System.out.println(date.toString());
        System.out.println(dateTime);
        System.out.println(date1);
        System.out.println(date2);
        return "{'module':'book save'}";
    }

}
