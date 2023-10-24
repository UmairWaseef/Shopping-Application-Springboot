package com.ecommerce.shoppingmarket.controller;

import com.ecommerce.shoppingmarket.model.Users;
import com.ecommerce.shoppingmarket.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("create")
    public String saveUser(@RequestBody Users users){
        return userService.save(users);
    }
}
