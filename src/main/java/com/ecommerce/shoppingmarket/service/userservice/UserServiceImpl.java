package com.ecommerce.shoppingmarket.service.userservice;


import com.ecommerce.shoppingmarket.model.Users;
import com.ecommerce.shoppingmarket.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public String save(Users users) {
        return (userRepo.save(users).getId());
    }

    @Override
    public List<Users> getAllUsers(){
        return userRepo.findAll();
    }
}
