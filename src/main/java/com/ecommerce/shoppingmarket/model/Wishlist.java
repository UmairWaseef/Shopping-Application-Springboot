package com.ecommerce.shoppingmarket.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "wishlist")
public class Wishlist {
    @Id
    private String id;
    private String userId;        // ID of the user who added the item to the wishlist
    private String productId;     // ID of the product in the wishlist
    private String productName;   // Name of the product
    // Add other wishlist item properties as needed
}
