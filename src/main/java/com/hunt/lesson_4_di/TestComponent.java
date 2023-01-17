package com.hunt.lesson_4_di;

import com.hunt.lesson_3_constructors.constructor.MotoBike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        /* Используется constructor.xml*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/constructor.xml");
        FrameOwn frameOwn = (FrameOwn) context.getBean("frameOwn");
        System.out.println(frameOwn.toString());
    }
}
