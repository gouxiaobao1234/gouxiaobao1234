package cn.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/login",params = {"username"},method = {RequestMethod.GET})
    public String login(){
        return "main";
    }
}
