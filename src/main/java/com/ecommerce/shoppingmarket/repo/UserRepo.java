package com.ecommerce.shoppingmarket.repo;

import com.ecommerce.shoppingmarket.model.Users;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<Users, String> {
}
