package com.example.demo;

public class Product {
    private Long productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(Long productID, String productName, double price, int stockQuantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Long getProductID() {
        return productID;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getStockQuantity() {
        return stockQuantity;
    }
    

    public void updateStock(int quantity) {
        if (quantity > 0 && this.stockQuantity >= quantity) {
            this.stockQuantity -= quantity;
        } else {
            throw new IllegalArgumentException("Stock insuffisant ou quantité invalide");
        }
    }

    public String getProductDetails() {
        return String.format("Produit: %s | Prix: %.2f€ | Stock: %d", productName, price, stockQuantity);
    }
}
