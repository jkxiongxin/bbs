package com.example.demo.jpa.controller;

import com.example.demo.jpa.model.User;
import com.example.demo.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/3 0003.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("list")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping
    public List<User> getUserByName(@RequestParam String name){
        return userRepository.findByName(name);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable Long userId){
        userRepository.deleteById(userId);
    }

}
