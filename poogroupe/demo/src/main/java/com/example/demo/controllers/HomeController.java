package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home"; // Vérifie que home.html existe dans resources/templates
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Vérifie que login.html existe aussi
    }
}
// Compare this snippet from poogroupe/demo/src/main/java/com/example/demo/controllers/OrderController.java:     
// package com.example.demo.controllers;