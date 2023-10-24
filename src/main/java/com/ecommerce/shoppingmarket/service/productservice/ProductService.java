package com.ecommerce.shoppingmarket.service.productservice;

import com.ecommerce.shoppingmarket.model.Product;


import java.util.List;


public interface ProductService {

    String addProduct(Product product);
    List<Product> getAllProduct();
    List<Product> filterProducts(String name, Double minPrice, Double maxPrice);
}
