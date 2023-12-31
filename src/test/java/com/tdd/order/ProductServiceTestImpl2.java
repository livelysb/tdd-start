package com.tdd.order;

import com.tdd.exception.InsufficientStockException;
import com.tdd.product.Product;
import com.tdd.product.ProductService;

import java.math.BigDecimal;

public class ProductServiceTestImpl2 implements ProductService {
    @Override
    public Product getProduct(Long productId) {
        return new Product(
                productId,
                0L,
                BigDecimal.valueOf(10000)
        );
    }

    @Override
    public void decreaseStock(Product product) {
        throw new InsufficientStockException();
    }
}
