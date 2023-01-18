package com.hunt.lesson_13_lang.controllers;


import com.hunt.lesson_13_lang.services.LanguageName2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyController2 {
    LanguageName2 languageName2;
@Autowired
    public void setLanguageName(LanguageName2 languageName) {
        this.languageName2 = languageName;
    }

    public void sayHello() {
        System.out.println(languageName2.getGreeting());
    }
}
