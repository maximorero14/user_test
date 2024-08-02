package com.maximorero.user_test.controller;

import com.maximorero.user_test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/all")
    public List<User> getUserData() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Juan", "Perez"));
        users.add(new User(2, "Ana", "Garcia"));
        users.add(new User(3, "Luis", "Martinez"));
        return users;
    }
}
