package com.hjl.controller;

import com.hjl.domain.User;
import com.hjl.mapper.UserMapper;
import com.hjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/save")
    @ResponseBody
    public String save(User user){
        userService.save(user);
        return "保存成功";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<User> userList = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}
