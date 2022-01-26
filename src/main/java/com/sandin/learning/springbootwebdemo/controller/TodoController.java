package com.sandin.learning.springbootwebdemo.controller;


import com.sandin.learning.springbootwebdemo.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    private static final Logger log = LoggerFactory
            .getLogger(TodoController.class);

    @Autowired
    private TodoService service;

    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
        String userId = "alex";
        model.put("name", userId);
        model.put("todos", service.retrieveTodos(userId));
        return "list-todos";
    }


}
