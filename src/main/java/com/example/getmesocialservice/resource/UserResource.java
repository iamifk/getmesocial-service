package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.service.UserService;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Service
public class UserResource{

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public User getUser(){
       return userService.getUser();

    }
}
