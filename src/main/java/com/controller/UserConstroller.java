package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConstroller {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public User fun(Integer id){
        System.out.println("load1");
        User u = userService.getUser(id);
        return u;
    }
}
