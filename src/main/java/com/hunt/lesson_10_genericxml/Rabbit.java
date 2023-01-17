package com.hunt.lesson_10_genericxml;

import org.springframework.stereotype.Component;

@Component("rabbit")
public class Rabbit {
    void sayHello(){
        System.out.println("Hello!!!");
    }
}
