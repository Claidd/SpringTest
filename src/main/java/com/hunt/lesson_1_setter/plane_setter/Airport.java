package com.hunt.lesson_1_setter.plane_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Airport {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/penetrationcontext.xml");
        Plane plane = (Plane) context.getBean("plane");

        System.out.println("number flyte: " + plane.getAirNumber());
        System.out.println("curreunt speed: " +plane.getAirSpeed());
        System.out.println("name pilot: " +plane.getAirPilot());
    }
}
