package com.tdd.order;

public interface OrderService {

    // 상품Id와 유저Id를 파라미터로하여 주문을 반환한다.
    Order createOrder(Long productId, String userId);
}
