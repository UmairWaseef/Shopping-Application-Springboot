package com.ecommerce.shoppingmarket.repo;

import com.ecommerce.shoppingmarket.model.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepo extends MongoRepository<Wishlist, String> {
    List<Wishlist> findByUserId(String userId);
}
