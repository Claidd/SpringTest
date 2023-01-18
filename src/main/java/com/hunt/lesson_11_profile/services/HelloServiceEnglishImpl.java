package com.hunt.lesson_11_profile.services;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
/* Если у класса поставить значение профайла default, то значение можно не указывать
        * Можно создавать нескольк профайлов */
@Profile({"default", "english"})
public class HelloServiceEnglishImpl implements HelloService {

    public String getGreeting() {
        return "Hello-Hello!";
    }
}
