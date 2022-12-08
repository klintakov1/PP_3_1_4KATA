package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.security.Principal;

@RestController
public class MainControllers {
    private final UserService userService;
@Autowired
    public  MainControllers(UserService userService){
    this.userService = userService;
}

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
