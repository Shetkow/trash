package com.example.web.controllers;

import com.example.web.LoginProcessor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private LoginProcessor loginProcessor;
    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }
    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();
        if (loggedIn) {
            model.addAttribute("message", "You are now logged in");
        } else {
            model.addAttribute("message", "Login failed");
        }
        return "login.html";

    }
}
