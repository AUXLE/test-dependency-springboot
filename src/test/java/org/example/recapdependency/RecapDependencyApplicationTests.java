package org.example.recapdependency;

import org.example.recapdependency.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class RecapDependencyApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;

    @Test
    void testApplicationContextFromCtx() {
        MyController myController1 = applicationContext.getBean(MyController.class);
        System.out.println(myController1.sayHello());
    }

    @Test
    void testMyController(){
        System.out.println(myController.sayHello());
    }

}
