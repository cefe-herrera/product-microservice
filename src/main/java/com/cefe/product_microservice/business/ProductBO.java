package com.cefe.product_microservice.business;

import com.cefe.product_microservice.entity.ProductEntity;

import java.util.List;

public interface ProductBO {

    List<ProductEntity> getAllProducts();

    void createProduct(ProductEntity p);
}
