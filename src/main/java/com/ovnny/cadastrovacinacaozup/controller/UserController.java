package com.ovnny.cadastrovacinacaozup.controller;

import com.ovnny.cadastrovacinacaozup.model.entities.User;
import com.ovnny.cadastrovacinacaozup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody @Validated User user) {
        return userRepository.save(user);
    }




}
