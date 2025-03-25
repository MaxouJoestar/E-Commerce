package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Laptop", 899.99, 10));
        products.add(new Product(2L, "Smartphone", 499.99, 15));
        products.add(new Product(3L, "Casque Bluetooth", 79.99, 25));

        model.addAttribute("products", products);
        return "products";
    }
}
