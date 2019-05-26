package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang_htao on 2019/5/26.
 */
@Controller
public class HelloController {

    private static int num;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println(num++);
        return "hello world";
    }
}
