package com.hunt.lesson_12_property.controller;

import com.hunt.lesson_12_property.services.LanguageName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component

public class PropertyController {
    LanguageName languageName;
@Autowired
    public void setLanguageName(LanguageName languageName) {
        this.languageName = languageName;
    }

    public void sayHello() {
        System.out.println(languageName.getGreeting());
    }
}
