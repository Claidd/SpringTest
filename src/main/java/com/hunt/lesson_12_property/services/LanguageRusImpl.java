package com.hunt.lesson_12_property.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("rus")
public class LanguageRusImpl implements LanguageName{
    @Override
    public String getGreeting() {
        return "Привет!";
    }
}
