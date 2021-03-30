package cn.chao.controller;

import cn.chao.domian.User;
import cn.chao.response.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/r")
public class RegisterController {

    @RequestMapping(value = "/register")
    public String register(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register2")
    @ResponseBody
    public String register2(@RequestBody User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register3")
    @ResponseBody
    public String register3(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register4")
    @ResponseBody
    public String register4(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register5")
    @ResponseBody
    public Object register5(User user){
        System.out.println(user);
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(200);
        responseResult.setData(user);
        responseResult.setMassage("注册成功！");
        return responseResult;
    }
}
