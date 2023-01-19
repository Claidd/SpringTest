package com.hunt.lesson_19_aop;

import org.springframework.stereotype.Component;

@Component
public class StudentJava {

    public String getMessage(){

        /*Хотим добавить сюда какой-то код-логику для каждого такого класса. */
        System.out.println("Hello, i am StudentJava");
        return "0";
    }

    public String getName(){
        return "Maxim";
    }
}
