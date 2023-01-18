package com.hunt.lesson_13_lang.services;

//@Component
//@Profile("rus")
public class LanguageRusImpl2 implements LanguageName2 {
    @Override
    public String getGreeting() {
        return "Привет!";
    }
}
