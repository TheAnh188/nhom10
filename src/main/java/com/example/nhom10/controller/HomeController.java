package com.example.nhom10.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //    @GetMapping("/")
//    public String hello(Model model){
//        model.addAttribute("message", "7297_VuTheAnh");
//        return "home/home";
//    }
    @GetMapping("/")
    public String index(){
        return "layout";
    }
}