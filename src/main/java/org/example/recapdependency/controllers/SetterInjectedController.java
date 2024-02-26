package org.example.recapdependency.controllers;

import org.example.recapdependency.services.greetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private greetingService greet;

    @Autowired
    public void setGreet(greetingService greet) {
        this.greet = greet;
    }

    String sayHello() {
        return greet.sayGreet();
    }
}
