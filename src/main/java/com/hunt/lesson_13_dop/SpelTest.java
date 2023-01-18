package com.hunt.lesson_13_dop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpelTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles();
        context.register(SpelTest.class);
        context.refresh();

        InjectSpel injectSpel = (InjectSpel) context.getBean("injectSpel");
        System.out.println(injectSpel);
    }
}
