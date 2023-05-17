package com.oauth2.springoauth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "Welcome to the landing page!";
    }

    @GetMapping("/secured")
    public String securedPage() {
        return "Now you are in secured zone";
    }
 }
