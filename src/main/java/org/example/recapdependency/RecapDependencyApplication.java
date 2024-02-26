package org.example.recapdependency;

import org.example.recapdependency.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RecapDependencyApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(RecapDependencyApplication.class, args);

        MyController myController = ctx.getBean(MyController.class);

        System.out.println("Inside the Main Class...");
        System.out.println(myController.sayHello());
    }

}
