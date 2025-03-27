package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Doit correspondre au nom de la vue dans src/main/resources/templates/login.html
    }

    @GetMapping("/home")
    public String homePage() {
        return "home"; // Page après connexion
    }
}
