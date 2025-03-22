package com.example.demo;

import java.util.List;

public class Order {

    private Long orderID;
    private User user;
    private List<Product> items;
    private String status;

    public Order(Long orderID, User user, List<Product> items) {
        this.orderID = orderID;
        this.user = user;
        this.items = items;
        this.status = "processing";
    }

    public void placeOrder() {
        for (Product product : items) {
            product.updateStock(1);
        }
        System.out.println("Commande placée avec succès !");
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Le statut de la commande a été mis à jour à : " + newStatus);
    }

    public Long getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }
}

