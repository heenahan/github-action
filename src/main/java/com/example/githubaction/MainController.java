package com.example.githubaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final Calculator calculator;

    public MainController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String add() {
        return "2 + 3 = " + calculator.add(2, 3);
    }

}
