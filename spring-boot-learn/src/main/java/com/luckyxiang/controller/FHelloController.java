package com.luckyxiang.controller;

import com.luckyxiang.dao.model.User;
import com.luckyxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("templates")
public class FHelloController {

    @Autowired
    UserService userService;


    @RequestMapping("fhello")
    public String hello(Model model) {
        String username = userService.getUser(1).getName();
        model.addAttribute("username", username);
        return "fhello";
    }

    @RequestMapping("findAllUser")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
