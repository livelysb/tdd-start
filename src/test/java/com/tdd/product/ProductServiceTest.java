package com.tdd.product;

import com.tdd.exception.InsufficientStockException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ProductServiceTest {

    ProductService productService;

    // decreaseStock을 수행하면 재고가 하나 차감된다.
    @Test
    public void decreaseStock() {
        productService = new ProductServiceImpl();
        Product product = new Product(
                1L,
                10L,
                BigDecimal.valueOf(10000)
        );

        productService.decreaseStock(product);
        assert product.stock == 9L;
    }

    // decreaseStock을 수행할때 재고가 0이면 InsufficientStockException을 던진다.
    @Test
    public void decreaseStock_throw_InsufficientStockException_if_stock_is_zero() {
        productService = new ProductServiceImpl();
        Product product = new Product(
                1L,
                0L,
                BigDecimal.valueOf(10000)
        );
        Exception exception = null;
        try {
            productService.decreaseStock(product);
        } catch (Exception e) {
            exception = e;
        }
        assert exception instanceof InsufficientStockException;
    }

}