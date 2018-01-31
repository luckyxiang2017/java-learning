package com.luckyxiang.controller;

import com.luckyxiang.dao.model.User;
import com.luckyxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("templates")
public class FHelloController {


    @RequestMapping("fhello")
    public String hello(Model model) {
        model.addAttribute("username", "xuxiang");
        return "fhello";
    }

}
