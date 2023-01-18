package com.hunt.lesson_12_property;

import com.hunt.lesson_12_property.controller.PropertyController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PropertyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles();
        context.register(PropertyTest.class);
        context.refresh();

        PropertyController propertyController = (PropertyController) context.getBean("propertyController");
        propertyController.sayHello();
    }
}
