package com.ovnny.cadastrovacinacao.controller;

import com.ovnny.cadastrovacinacao.model.entities.User;
import com.ovnny.cadastrovacinacao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(name = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "Vá para as rotas /users para requisitar todos os usuários";
    }

    @GetMapping(name = "/users")
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody @Validated User user) {
        return userRepository.save(user);
    }




}
