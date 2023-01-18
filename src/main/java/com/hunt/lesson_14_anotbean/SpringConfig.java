package com.hunt.lesson_14_anotbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/*Помечаем класс как компонент, но не простой, а как класс конфигураций и настроек*/
@Configuration


public class SpringConfig {
    @Lazy
    @Bean(name = "user")
    /*Прописали способ создания юзера и пометили его как бин. Этот метод будет отвечать за создание бина.
    * Если бину не даем параметров в анатацию, то можем вызвать по дефолту по имени класса
    * и второе по названию метода*/
    public User getUser(String name, int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}
