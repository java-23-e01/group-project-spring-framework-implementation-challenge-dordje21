package com.example.mvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @RequestMapping("/user")
    public String getUser(@RequestParam("name") String name, Model model) {
//        model.addAttribute("date", name);
        model.addAttribute("date", new java.util.Date());
        return "index";
    }
}
