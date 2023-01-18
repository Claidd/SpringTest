package com.hunt.lesson_1_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/appcontext.xml");
        MessageRender mr = ctx.getBean("render", MessageRender.class);
        mr.render();
    }
}
