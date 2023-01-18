package com.hunt.lesson_11_profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("russian")
public class HelloServiceRussianImpl implements HelloService {

    public String getGreeting() {
        return "Привет-Привет!";
    }
}
