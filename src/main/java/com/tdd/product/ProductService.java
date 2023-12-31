package com.tdd.product;

public interface ProductService {
    Product getProduct(Long productId);

    void decreaseStock(Product product);
}
