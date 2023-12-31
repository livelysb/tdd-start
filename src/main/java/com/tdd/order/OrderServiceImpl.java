package com.tdd.order;

import com.tdd.product.Product;
import com.tdd.product.ProductService;
import com.tdd.exception.InsufficientStockException;
import com.tdd.exception.OrderCreateFailedException;

public class OrderServiceImpl implements OrderService {

    private final ProductService productService;

    public OrderServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Order createOrder(Long productId, String userId) throws InsufficientStockException {
        try {
            Product product = productService.getProduct(productId);
            productService.decreaseStock(product);
            return new Order(productId, product.price, userId);
        } catch (InsufficientStockException e) {
            throw new OrderCreateFailedException();
        }
    }
}
