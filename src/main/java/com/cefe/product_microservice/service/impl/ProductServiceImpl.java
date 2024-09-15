package com.cefe.product_microservice.service.impl;

import com.cefe.product_microservice.ProductMicroserviceApplication;
import com.cefe.product_microservice.business.ProductBO;
import com.cefe.product_microservice.entity.ProductEntity;
import com.cefe.product_microservice.repository.ProductRepository;
import com.cefe.product_microservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductBO productBO;

    @Override
    public List<ProductEntity> getAllProducts(){
        return this.productBO.getAllProducts();
    }

    @Override
    public void createProduct(ProductEntity p){
        this.productBO.createProduct(p);
    }

}
