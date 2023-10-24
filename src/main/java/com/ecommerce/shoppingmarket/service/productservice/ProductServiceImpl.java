package com.ecommerce.shoppingmarket.service.productservice;

import com.ecommerce.shoppingmarket.model.Product;
import com.ecommerce.shoppingmarket.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public String addProduct(Product product){
        return productRepo.save(product).getId();
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public List<Product> filterProducts(String name, Double minPrice, Double maxPrice) {
        if (name != null) {
            return productRepo.findByNameContainingIgnoreCase(name);
        } else if (minPrice != null && maxPrice != null) {
            return productRepo.findByPriceBetween(minPrice, maxPrice);
        } else if (minPrice != null) {
            return productRepo.findByPriceGreaterThan(minPrice);
        } else if (maxPrice != null) {
            return productRepo.findByPriceLessThan(maxPrice);
        } else {
            return productRepo.findAll();
        }
    }
}
