package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user=new User("irfan","Toronto",28,"iamifk");
        return user;

    }
}
