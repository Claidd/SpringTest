package com.hunt.lesson_10_genericxml.test1;

import org.springframework.stereotype.Component;

@Component("rabbit")
public class Rabbit {
    public void sayHello(){
        System.out.println("Hello!!!");
    }
}
