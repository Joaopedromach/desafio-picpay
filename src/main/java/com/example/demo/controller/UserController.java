package com.example.demo.controller;

import com.example.demo.domain.user.User;
import com.example.demo.domain.user.UserDTO;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserService service;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
    User newUser = service.createUser(user);

    }


}
