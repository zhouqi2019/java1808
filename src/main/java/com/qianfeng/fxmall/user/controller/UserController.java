package com.qianfeng.fxmall.user.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {



    @RequestMapping("/login")
    public ModelAndView login(String username,String password){
        System.out.println("进入方法");
        System.out.println(username+"/"+password);
        ModelAndView modelAndView = new ModelAndView("goods.do?m=queryGoodsByPage");
        return modelAndView;
    }
}
