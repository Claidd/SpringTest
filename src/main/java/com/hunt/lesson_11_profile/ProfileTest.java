package com.hunt.lesson_11_profile;

import com.hunt.lesson_11_profile.controllers.HelloController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProfileTest {

    public static void main(String[] args) {
        /*Сперва создать пустой контекст, буз пути */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        /*Меняем апликатион контекст на анататион конфиг, далее внедряем профайл (который мы приравнивали классам
        * с одной зависимостью) Можем вывести в проперти и оттуда передавать в значение
        * Если у класса поставить значение профайла default, то значение можно не указывать
        * Можно создавать нескольк профайлов */

        context.getEnvironment().addActiveProfile("russian");

        /*Регистрируем путь и обнаовляем */

        context.register(ProfileTest.class);
        context.refresh();

        HelloController controller = (HelloController) context.getBean("helloController");
        controller.sayHello();

    }

}
