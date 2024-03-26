package com.example.SeminarTask4.controller;


import com.example.SeminarTask4.model.Product;
import com.example.SeminarTask4.service.ProductService;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProduct(Model model){
        List<Product> products =productService.findAll();
        model.addAttribute("products", products);
        return "productsTemplates";
    }
    @PostMapping("/products")
    public String addProduct(Product product, Model model){
        productService.addProduct(product);
        List<Product> products =productService.findAll();
        model.addAttribute("products", products);
        return "productsTemplates";
    }

}
