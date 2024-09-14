package com.cefe.product_microservice.service;

import com.cefe.product_microservice.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getAllProducts();

    void createProduct(ProductEntity p);

}
