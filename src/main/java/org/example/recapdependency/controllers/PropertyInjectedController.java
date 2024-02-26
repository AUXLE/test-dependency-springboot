package org.example.recapdependency.controllers;

import org.example.recapdependency.services.greetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    greetingService greet;

    String sayHello() {
        System.out.println("Hello, inside the Controller");

        return greet.sayGreet();
    }

}
