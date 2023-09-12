package com.example.web20.controllers;

import com.example.web20.model.Product;
import com.example.web20.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {
    private final ProductService productService;

    public MainController(ProductService productService) {
        this.productService = productService;
        Product p = new Product();
        p.setPrice(12.33);
        p.setName("beer");
        productService.addProduct(p);
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }


}
