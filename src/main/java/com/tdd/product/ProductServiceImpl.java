package com.tdd.product;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProduct(Long productId) {
        return null;
    }

    @Override
    public void decreaseStock(Product product) {
        product.decreaseStock();
    }
}
