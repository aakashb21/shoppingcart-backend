package com.shoppingcart.shoppingcart.controller;

import com.shoppingcart.shoppingcart.model.Products;
import com.shoppingcart.shoppingcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class CreateShoppingCart extends SpringBootServletInitializer {

    Logger logger = Logger.getLogger(CreateShoppingCart.class.getName());

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/createCart", method = RequestMethod.POST)
    public ResponseEntity<?> createCart() {
        System.out.println("Create cart method called");
        return ResponseEntity.ok().body("Success call");
    }

    @RequestMapping(value = "/getCart", method = RequestMethod.GET)
    public List<Products> getCartContents() {
        logger.info("Get cart contents = {}"+ productRepository.findAll());
        return productRepository.findAll();
    }
}