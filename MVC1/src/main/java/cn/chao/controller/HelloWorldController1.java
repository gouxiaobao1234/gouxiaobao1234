package cn.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController1 {

    @RequestMapping(value = "/login1")
    public String login1(){
        System.out.println("HelloWorldController--->login1");
        return "main";
    }

    @RequestMapping(value = "/login2")
    public String login(){
        System.out.println("HelloWorldController--->login2");
        return "main";
    }
}
