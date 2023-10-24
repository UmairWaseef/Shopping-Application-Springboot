package com.ecommerce.shoppingmarket.repo;

import com.ecommerce.shoppingmarket.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<Product, String > {
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByPriceGreaterThan(double minPrice);
    List<Product> findByPriceLessThan(double maxPrice);
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
}
