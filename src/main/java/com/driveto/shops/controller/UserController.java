package com.driveto.shops.controller;


import com.driveto.shops.entity.User;
import com.driveto.shops.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author oawon
 * @since 2019-may-16
 */
@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<User> create(@RequestBody final User user){
        userService.create(user);
        return userService.getAll();
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}
