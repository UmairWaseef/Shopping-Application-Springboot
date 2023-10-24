package com.ecommerce.shoppingmarket.controller;

import com.ecommerce.shoppingmarket.model.Product;
import com.ecommerce.shoppingmarket.service.productservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("post/products")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("get/products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/filter")
    public List<Product> filterProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {
        return productService.filterProducts(name, minPrice, maxPrice);
    }


}
