package org.example.recapdependency.controllers;

import org.example.recapdependency.services.greetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final greetingService greet;

    public ConstructorInjectedController(greetingService greet) {
        this.greet = greet;
    }

    String sayHello() {
        return greet.sayGreet();
    }
}
