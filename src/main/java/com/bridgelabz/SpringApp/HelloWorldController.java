package com.bridgelabz.SpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @PostMapping("/greet")
    public String getMessage() {
        return "Hello from Bridgelabz";
    }
}
