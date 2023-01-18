package com.hunt.lesson_13_lang.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
/*Подключаем сорс с указаноием пути к настроечному файлу*/
@PropertySource("application.properties")
/*Профайл пока отключаем*/
//@Profile({"default", "eng"})
public class LanguageEngImpl2 implements LanguageName2 {

    /* экпресион ленг начинается с решетки
    * доллар - обращение к ключу, должен совпадать точно
    * А решетка позволяет создавать выражения, вычисления
    * для строк нужны одинарные ковычки*/
//    @Value("#{'100'+'100'}")

    /*Передача праметров из другого класса. Пишем к нему путь и создаем новый объект
    * спринг его создаст и вызовет name. Можем добавлять обращения к значениям из проперти и добавлять в запрос
    * но необходимо заключать их в одинарыне ковычки*/
    @Value("#{new com.hunt.lesson_13_lang.services.TestEL().name + ' ' + '${greeting}' }")
    private String greeting;

    /*при импорте в скобках используем Т*/
    @Value("#{T (java.lang.Math).PI}")
//    @Value("#{1+100}")
    private double number;
    @Override
    public String getGreeting() {
        return String.valueOf(greeting);
    }
}
