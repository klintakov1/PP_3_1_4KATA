package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainControllers {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }


    @GetMapping("/read_profile")
    public String pageForReadProfile() {
        return "read prodile page";
    }

    @GetMapping("/authenticated")
    public String pageForAutheticatedUsers(Principal principal) {
        return "secured part of web service: " + principal.getName();
    }

    @GetMapping("/only_for_admins")
    public String pageOnlyForAdmins() {
        return "admins page";
    }
}
