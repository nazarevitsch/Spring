package com.bida.springHomeWork.demo.web;

import com.bida.springHomeWork.demo.domain.Product;
import com.bida.springHomeWork.demo.service.ProducerService;
import com.bida.springHomeWork.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProducerService producerService;

    @ModelAttribute("product")
    public Product product(){return new Product();}

    @GetMapping("/products")
    public String findAll(Model model){
            model.addAttribute("products", productService.findAllProducts());
        return "product";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/add_product")
    public String createProductPage(Model model){
        model.addAttribute("producers", producerService.findAllProducer());
        return "add-product";
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Long> deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
