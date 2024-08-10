package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String home() {
        return "index"; // This corresponds to src/main/resources/templates/index.html
    }
}
