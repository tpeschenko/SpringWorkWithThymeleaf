package com.example.SeminarTask4.service;

import com.example.SeminarTask4.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productsList = new ArrayList<>();

    public List<Product> addProduct(Product product){
        productsList.add(product);
        return productsList;
    }

    public List<Product> findAll(){
        return productsList;
    }
}
