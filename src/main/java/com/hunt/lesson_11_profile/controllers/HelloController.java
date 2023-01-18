package com.hunt.lesson_11_profile.controllers;

import com.hunt.lesson_11_profile.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class HelloController {

    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello(){
        System.out.println(helloService.getGreeting());
    }


}
