package com.cefe.product_microservice.business.impl;

import com.cefe.product_microservice.business.ProductBO;
import com.cefe.product_microservice.entity.ProductEntity;
import com.cefe.product_microservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductBOImpl implements ProductBO {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @Override
    public void createProduct(ProductEntity p){
        productRepository.save(p);
    }

}
