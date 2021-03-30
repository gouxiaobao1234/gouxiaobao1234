package cn.chao.controller;

import cn.chao.domian.Address;
import cn.chao.domian.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user2")
public class UserController2 {
    //传替值
    @RequestMapping(value = "/queryByUserName")
    public String queryByUserName(@RequestParam(name = "username") String name){
        System.out.println("请求过来的参数值：" + name);
        return null;
    }
    //默认值
    @RequestMapping(value = "/queryByUserName1")
    public String queryByUserName1(@RequestParam(name = "username",
            required = false,
            defaultValue = "苏宝盖") String name){
        System.out.println("请求过来的参数值：" + name);
        return null;
    }

    //RequestBody
    @RequestMapping(value = "/register")
    public String register(@RequestBody String bodyContent){
        System.out.println("请求体内容是：" + bodyContent);
        return null;
    }

    @RequestMapping(value = "/queryUser")
    public void queryUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = new User();
        user.setUsername("负三金");
        user.setAge(28);
        user.setBorn(new Date());
        user.setPassword("123");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("河南","安阳"));
        addresses.add(new Address("上海","甲鱼区"));
        user.setAddressList(addresses);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/WEB-INF/jsp/userInfo.jsp").forward(request,response);
    }

    @RequestMapping(value = "queryUser1")
    public String queryUser(Map<String,Object> map){
        User user = new User();
        user.setUsername("负三金");
        user.setAge(28);
        user.setBorn(new Date());
        user.setPassword("123");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("河南","安阳"));
        addresses.add(new Address("上海","甲鱼"));
        user.setAddressList(addresses);
        map.put("user",user);
        return "userInfo";
    }

    @RequestMapping(value = "queryUser2")
    public String queryUser(Model model){
        User user = new User();
        user.setUsername("负三金");
        user.setAge(28);
        user.setBorn(new Date());
        user.setPassword("123");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("河南","安阳"));
        addresses.add(new Address("上海","甲鱼区鸭"));
        user.setAddressList(addresses);
        model.addAttribute("user",user);
        return "userInfo";
    }

    @RequestMapping(value = "queryUser3")
    public String queryUser(ModelMap modelMap){
        User user = new User();
        user.setUsername("负三金");
        user.setAge(28);
        user.setBorn(new Date());
        user.setPassword("123");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("河南","安阳市"));
        addresses.add(new Address("上海","甲鱼区鸭"));
        user.setAddressList(addresses);
        modelMap.addAttribute("user",user);
        return "userInfo";
    }

    @RequestMapping(value = "queryUser4")
    public ModelAndView queryUser(){
        User user = new User();
        user.setUsername("负三金");
        user.setAge(28);
        user.setBorn(new Date());
        user.setPassword("123");
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address("浙江","杭州"));
        addresses.add(new Address("河南","商丘"));
        user.setAddressList(addresses);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("userInfo");
        return mv;
    }

    //返回值String
    //重定向
    @RequestMapping(value = "/toUserInfo")
    public String toUserInfo(){
        return "redirect:/index.jsp";
    }

    //请求转发
    @RequestMapping(value = "/toUserInfo2")
    public String toUserInfo2(){
        return "forward:/WEB-INF/jsp/userInfo.jsp";
    }

    //返回字符串
    @RequestMapping(value = "/toUserInfo3")
    @ResponseBody                                // 需要加一个注解
    public String toUserInfo3(){
       	return "老不甲";
    }

    //返回值void
    //重定向
    @RequestMapping(value = "/toUserInfo4")
    public void toUserInfo4(HttpServletResponse response)throws Exception{
        response.sendRedirect("redirect:/index.jsp");
    }

    //请求转发
    @RequestMapping(value = "/toUserInfo5")
    public void toUserInfo5(HttpServletRequest request,HttpServletResponse response)throws Exception{
        request.getRequestDispatcher("/WEB-INF/jsp/userInfo.jsp").forward(request,response);
    }

    //通过响应流向浏览器返回数据
    @RequestMapping(value = "/toUserInfo6")
    public void toUserInfo6(HttpServletRequest request,HttpServletResponse response)throws Exception{
        response.setContentType("application/json;charset=utf-8");
        User user=new User();
        user.setUsername("负三金");
        user.setPassword("123456");
        user.setAge(29);
        String zhuanhuan= JSONObject.toJSONString(user);
        response.getWriter().write(zhuanhuan);
    }

}
