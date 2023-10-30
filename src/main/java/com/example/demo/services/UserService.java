package com.example.demo.services;

import com.example.demo.domain.user.User;
import com.example.demo.domain.user.UserDTO;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository repository;
    private void saveUser()
    public User createUser(UserDTO user) {
    User newUser = new User(user);
     this.saveUser(newUser);
     return newUser;
    }
}
