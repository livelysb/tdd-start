package com.tdd.order;

import com.tdd.exception.OrderCreateFailedException;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class OrderServiceTest {

    OrderService orderService;


    // 주문의 price는 상품의 가격이어야 한다.
    // productService.decreaseStock이 예외를 발생하지 않으면, 주문은 성공한다.
    @Test
    public void createOrder() {
        orderService = new OrderServiceImpl(new ProductServiceTestImpl());
        Order order = orderService.createOrder(1L, "livelysb");
        assert order != null;
        assert order.price.equals(BigDecimal.valueOf(10000));
    }

    // productService의 decreaseStock에서 InsufficientStockException 예외를 발생하면 나도 OrderCreateFailedException을 반환한다.
    @Test
    public void createOrder_when_stock_is_zero() {
        orderService = new OrderServiceImpl(new ProductServiceTestImpl2());
        Exception exception = null;
        try {
            Order order = orderService.createOrder(1L, "livelysb");
        } catch(Exception e) {
            exception = e;
        }
        assert exception != null;
        assert exception instanceof OrderCreateFailedException;
    }



}