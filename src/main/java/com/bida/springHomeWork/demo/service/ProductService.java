package com.bida.springHomeWork.demo.service;

import com.bida.springHomeWork.demo.domain.Product;
import com.bida.springHomeWork.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
