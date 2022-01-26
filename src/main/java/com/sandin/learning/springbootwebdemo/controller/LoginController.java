package com.sandin.learning.springbootwebdemo.controller;


import com.sandin.learning.springbootwebdemo.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    private static final Logger log = LoggerFactory
            .getLogger(LoginController.class);

    @Autowired
    private LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage( ModelMap model){
//        model.put("name", "name");
//        log.info("name is: {}", "name");
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage( ModelMap model,
                                   @RequestParam String name,
                                   @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser){
            model.put("message", "invalid credentials.!");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);
//        log.info("name is: {}", "name");
        return "welcome";
    }

}
