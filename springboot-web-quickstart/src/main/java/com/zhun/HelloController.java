package com.zhun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

// @RestController：餐厅的“招牌”
//它的作用是：告诉系统，这个类是专门用来“接待客人”并“返回数据”的。
@RestController
public class HelloController {
    //@RequestMapping：餐厅的“门牌号”
    //它的作用是：告诉系统，这个类或方法对应的“网址路径”是什么。
    @RequestMapping("/hello")
    public String hello(String  name) {
        System.out.println("hello" +  name);
        return "Hello" + name + "!";
    }
}
