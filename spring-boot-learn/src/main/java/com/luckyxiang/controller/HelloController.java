package com.luckyxiang.controller;

import com.luckyxiang.dao.model.User;
import com.luckyxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    public String hello() {
        //double a = 1 / 0;

        String username = userService.getUser(1).getName();
        return "hello";
    }

    @RequestMapping("findAllUser")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping("findByEmail")
    public List<User> findByEmail(String email) {
        return userService.findByEmail(email);
    }
}
