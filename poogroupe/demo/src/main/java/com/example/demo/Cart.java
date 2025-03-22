package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private User user;
    private Map<Product, Integer> items;

    public Cart(User user) {
        this.user = user;
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La quantité doit être positive.");
        }
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La quantité doit être positive.");
        }
        items.remove(product);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }

    public User getUser() {
        return user;
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}
