package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Service
@Repository

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
       return userRepository.getUser();


    }
}
