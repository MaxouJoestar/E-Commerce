package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class User {
    private String username;
    private String email;
    private String password;
    private List<Order> orderHistory;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = hashPassword(password);
        this.orderHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void register() {
        System.out.println("User " + username + " registered successfully.");
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }

    public void viewOrderHistory() {
        if (!orderHistory.isEmpty()) {
            System.out.println("Order History:");
            for (Order order : orderHistory) {
                System.out.println(order);
            }
        } else {
            System.out.println("No past orders found.");
        }
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
        System.out.println("Order added successfully.");
    }

    private String hashPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
