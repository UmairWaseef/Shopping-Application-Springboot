package com.ecommerce.shoppingmarket.service.userservice;

import com.ecommerce.shoppingmarket.model.Users;

import java.util.List;

public interface UserService {
    String save(Users users);
    List<Users> getAllUsers();
}
