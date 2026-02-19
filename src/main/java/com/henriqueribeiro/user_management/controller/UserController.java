package com.henriqueribeiro.user_management.controller;

import com.henriqueribeiro.user_management.model.User;
import org.springframework.web.bind.annotation.*;
import com.henriqueribeiro.user_management.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User create (@RequestBody User user) {

        var id = UUID.randomUUID().toString();
        user.setId(id);

        userRepository.save(user);

        return user;
    }


    @GetMapping()
    public List<User> Findall() {
        return userRepository.findAll();
    }


    @GetMapping("/{id}")
    public User findById(@PathVariable("id") String id) {

        return userRepository.findById(id).orElse(null);
    }


    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") String id, @RequestBody User user) {
        user.setId(id);
        userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String id) {
        userRepository.deleteById(id);
    }

}
