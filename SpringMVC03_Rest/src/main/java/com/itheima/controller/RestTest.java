package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @time: 8/11/2022 14:39
 */
//@Controller
//@ResponseBody // 当该Controller中的方法都有@ResponseBody，可以直接写在类上
@RestController // 当@controller和@ResponseBody都在类上，可以简写成@RestController
@RequestMapping("/test")
public class RestTest {
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String postTest(){
        System.out.println("------------");
        return "postTest ....";
    }
//    @RequestMapping(value = "/{id}/{name}", method = RequestMethod.GET)
    @GetMapping("/{id}/{name}")
    public String getTest(@PathVariable Integer id, @PathVariable String name){
        System.out.println("------------");
        System.out.println("getTest.id=" + id + ", name=" + name);
        return "getTest ....";
    }
//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String putTest(@RequestBody User user){
        System.out.println("------------");
        System.out.println("putTest.user=" + user);
        return "putTest ....";
    }
//    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping
    public String deleteTest(@RequestBody List<User> list){
        System.out.println("------------");
        System.out.println("deleteTest.list=" + list);
        return "deleteTest ....";
    }
}


/*
@Controller
@RequestMapping("/test")
public class RestTest {
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String postTest(){
        System.out.println("------------");
        return "postTest ....";
    }
    @RequestMapping(value = "/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String getTest(@PathVariable Integer id, @PathVariable String name){
        System.out.println("------------");
        System.out.println("getTest.id=" + id + ", name=" + name);
        return "getTest ....";
    }
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String putTest(@RequestBody User user){
        System.out.println("------------");
        System.out.println("putTest.user=" + user);
        return "putTest ....";
    }
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteTest(@RequestBody List<User> list){
        System.out.println("------------");
        System.out.println("deleteTest.list=" + list);
        return "deleteTest ....";
    }
}
*/
