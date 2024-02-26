package org.example.recapdependency.controllers;

import org.example.recapdependency.services.greetingService;
import org.example.recapdependency.services.greetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final greetingService greet;

    public MyController() {
        this.greet = new greetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Inside the Controller");

        return greet.sayGreet();
    }
}
