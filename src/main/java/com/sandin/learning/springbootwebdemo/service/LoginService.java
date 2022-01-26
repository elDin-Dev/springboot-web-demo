package com.sandin.learning.springbootwebdemo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String userId, String password){
        return (userId.equalsIgnoreCase("din") &&
                password.equalsIgnoreCase("san"));
    }

}
