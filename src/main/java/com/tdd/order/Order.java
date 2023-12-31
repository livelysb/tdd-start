package com.tdd.order;

import java.math.BigDecimal;

public class Order {
    public Long id;

    public Long productId;

    public BigDecimal price;

    public String userId;

    public Order(Long productId, BigDecimal price, String userId) {
        this.productId = productId;
        this.price = price;
        this.userId = userId;
    }
}
