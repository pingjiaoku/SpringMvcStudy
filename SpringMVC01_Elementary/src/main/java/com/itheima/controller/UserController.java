package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @time: 5/11/2022 17:23
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/save") // 设置当前操作的访问路径
    @ResponseBody  // 设置当前操作的返回值类型
    public String save(){
        System.out.println("UserSave ...");
        return "{'module':'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("UserDelete ...");
        return "{'module':'user delete'}";
    }
}
