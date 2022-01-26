package com.sandin.learning.springbootwebdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private static final Logger log = LoggerFactory
            .getLogger(LoginController.class);

    @RequestMapping("/login")
    public String loginMessage(@RequestParam String name, ModelMap model){
        model.put("name", name);
        log.info("name is: {}", name);
        return "login";
    }
}
