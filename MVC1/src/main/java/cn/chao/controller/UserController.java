package cn.chao.controller;

import cn.chao.domian.Address;
import cn.chao.domian.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/register")
    public String register(String username,String password , Integer age){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("age = " + age);
        return null;
    }

    @RequestMapping(value = "/register1")
    public String registeruser(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register2")
    public String registera(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register3")
    public String registerlist(User user){
        System.out.println(user);
        List<Address> addressList=user.getAddresses();
        for (Address address:addressList) {
            System.out.println(address);
        }
        return null;
    }

    @RequestMapping(value = "/register4")
    public String registermap(User user){
        System.out.println(user);
        Map<String,Address> addressMap=user.getAddressMap();
        Set<Map.Entry<String, Address>> addressSet= addressMap.entrySet();
        for (Map.Entry<String, Address> entry:addressSet) {
            System.out.println("key="+entry.getKey());
            System.out.println("key="+entry.getValue());
        }
        return null;
    }

    @RequestMapping(value = "/register5")
    public String register(User user){
        System.out.println(user);
        return null;
    }

    //时间第一种
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false); // 严格按照指定的格式进行解析
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }
    @RequestMapping(value = "/register6")
    public String register6(User user){
        System.out.println(user);
        return null;
    }

    @RequestMapping(value = "/register7")
    public String register7(User user){
        System.out.println(user);
        return null;
    }

}
