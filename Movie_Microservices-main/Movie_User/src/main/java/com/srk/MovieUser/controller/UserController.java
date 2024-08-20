package com.srk.MovieUser.controller;

import com.srk.MovieUser.client.FullResponse;
import com.srk.MovieUser.model.User;
import com.srk.MovieUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/m1")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/movie/{mid}")
    public List<User> getUsersByMid(@PathVariable Integer mid) {
        return userService.getUsersByMid(mid);
    }

    @GetMapping("/user/{userid}")
    public FullResponse getUserWithFeedbacks(@PathVariable int userid) {
        return userService.getUserWithFeedbacks(userid);
    }

}