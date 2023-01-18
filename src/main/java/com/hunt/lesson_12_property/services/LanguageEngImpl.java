package com.hunt.lesson_12_property.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
/*Подключаем сорс с указаноием пути к настроечному файлу*/
@PropertySource("application.properties")
/*Профайл пока отключаем*/
//@Profile({"default", "eng"})
public class LanguageEngImpl implements LanguageName {

    /* ставим аннотацию велю сюда мы можем передавать значения параметров, в том числе и из файлов
    * ставим доллар, скобки и название проперти*/
    @Value("${greeting}")
    private String greeting;
    @Override
    public String getGreeting() {
        return String.valueOf(greeting);
    }
}
