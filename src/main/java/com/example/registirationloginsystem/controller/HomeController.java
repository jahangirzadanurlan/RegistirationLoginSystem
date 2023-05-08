package com.example.registirationloginsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showHomePage(Model model, HttpSession httpSession){
        String username= (String) httpSession.getAttribute("username");
        model.addAttribute("username",username);
        return "home";
    }
}
