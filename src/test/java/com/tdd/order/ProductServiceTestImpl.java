package com.tdd.order;

import com.tdd.product.Product;
import com.tdd.product.ProductService;

import java.math.BigDecimal;

public class ProductServiceTestImpl implements ProductService {
    @Override
    public Product getProduct(Long productId) {
        return new Product(
                productId,
                10L,
                BigDecimal.valueOf(10000)
        );
    }

    @Override
    public void decreaseStock(Product product) {

    }
}
