package com.cetpa.controllers;

import com.cetpa.entities.User;
import com.cetpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getuser")
    public List<User> getUser(){
        return  userService.getUser();
    }

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        return  userService.createUser(user);
    }
}
