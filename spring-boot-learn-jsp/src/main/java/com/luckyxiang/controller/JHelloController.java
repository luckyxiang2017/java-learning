package com.luckyxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsps")
public class JHelloController {

    @RequestMapping("jhello")
    public String hello(Model model) {
        model.addAttribute("username", "xuxiang");
        return "jhello";
    }
}
