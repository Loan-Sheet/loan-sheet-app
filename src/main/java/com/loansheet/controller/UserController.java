package com.loansheet.controller;

import com.loansheet.model.User;
import com.loansheet.service.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
@RequestMapping("_int/api/v1/users")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public Flux<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create-random")
    public Mono<User> createRandomUser() {
        var randomUser = new User();
        randomUser.setName("u_"+ System.currentTimeMillis());
        randomUser.setEmail(randomUser.getName()+"@example.loan-sheet.dev.com.co");
        return userService.createUser(randomUser);
    }
}
