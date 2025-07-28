package com.vk.myApp.MySpringApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.vk.myApp.MySpringApp.model.Product;
@Service
public class ProductService {
    List<Product> products = new ArrayList<>();

    public List<Product> getAllProducts() {
        return products;
    }

     public void addProduct(@RequestBody Product product) {
        products.add(product);
    }

    public void deleteProduct(@PathVariable int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
