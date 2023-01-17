package com.hunt.lesson_6_di_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppCanvase {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        Hero hero = context.getBean("hero", Hero.class);
        System.out.println(hero.toString());
    }
}
