package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @time: 7/11/2022 17:44
 */
@Controller
public class UserController {

    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO() {
        System.out.println("返回json对象数据");
        User user = new User();
        user.setId(1);
        user.setName("东啊東");
        user.setAge(22);
        return user;
    }


    @RequestMapping("/toJsonPojoList")
    @ResponseBody
    public List<User> toJsonPojoList() {
        System.out.println("返回json对象数据");
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setName("东啊東");
        user1.setAge(22);
        list.add(user1);
        User user2 = new User();
        user2.setId(2);
        user2.setName("dongadong");
        list.add(user2);
        return list;
    }
}
