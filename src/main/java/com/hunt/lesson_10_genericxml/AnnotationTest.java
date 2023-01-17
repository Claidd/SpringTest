package com.hunt.lesson_10_genericxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/annot.xml");
        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
   }
}
