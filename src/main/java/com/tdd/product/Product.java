package com.tdd.product;

import com.tdd.exception.InsufficientStockException;

import java.math.BigDecimal;

public class Product {
    public Long productId;

    public Long stock;

    public BigDecimal price;

    public Product(Long productId, Long stock, BigDecimal price) {
        this.productId = productId;
        this.stock = stock;
        this.price = price;
    }
    public void decreaseStock() {
        if (stock == 0) {
            throw new InsufficientStockException();
        } else {
            stock--;
        }
    }
}
