package cn.chao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextController {

    @RequestMapping(value = "/myException")
    public String myException()throws Exception {
            int x = 12/0;
            throw new Exception("根据id查询用户异常");
    }
}
