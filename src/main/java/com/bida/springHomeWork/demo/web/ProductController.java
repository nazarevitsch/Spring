package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.domain.Product;
import com.bida.springHomeWork.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String findAll(@RequestParam("Authorization") String token){
        return "product-list";
    }
}
