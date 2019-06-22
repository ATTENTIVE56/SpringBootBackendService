package com.gfg.amit.SpringBootBackendService.controller;

import com.gfg.amit.SpringBootBackendService.model.User;
import com.gfg.amit.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return null;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return null;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){

        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){

        return user;
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id){

    }
}
