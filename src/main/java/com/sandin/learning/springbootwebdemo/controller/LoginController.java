package com.sandin.learning.springbootwebdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/lol")
    public String loginMessage(){

        return "lol";
    }
}
