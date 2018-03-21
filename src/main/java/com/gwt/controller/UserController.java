package com.gwt.controller;

import com.gwt.pojo.User;
import com.gwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("allUser")
    @ResponseBody
    public List<User> getUser(){
        List<User> users = userService.findUser();
        System.out.println(users);
        return users;
    }

    @ResponseBody
    @RequestMapping("getUser/{id}")
    public User getUserById(@PathVariable("id")Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("addUser")
    public void addUser(User user){
        userService.addUser(user);
    }

}
