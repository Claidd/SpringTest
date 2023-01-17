package com.hunt.lesson_1_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test_xml/appcontext.xml");
        MessageRender mr = ctx.getBean("render", MessageRender.class);
        mr.render();
    }
}
