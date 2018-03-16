package com.gwt.controller;

import com.gwt.pojo.User;
import com.gwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public List<User> getUser(){
        List<User> users = userService.findUser();
        System.out.println(users);
        return users;
    }

}
