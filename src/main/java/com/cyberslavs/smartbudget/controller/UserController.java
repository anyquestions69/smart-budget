package com.cyberslavs.smartbudget.controller;

import com.cyberslavs.smartbudget.model.User;
import com.cyberslavs.smartbudget.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/{email}")
    User findOne(@PathVariable String email){
        return userRepository.findByEmail(email);
    }
    @PostMapping("/register")
    String register(@RequestBody User user){
        User newUser  = userRepository.save(user);
        return newUser.getEmail();
    }
}
