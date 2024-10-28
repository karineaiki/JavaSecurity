package application.properties.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Hello world";
    }

    @GetMapping("/profile")
    public String profile() {
        return "My profile";
    }
}