package com.hunt.lesson_13_lang;


import com.hunt.lesson_13_dop.InjectSpel;
import com.hunt.lesson_13_lang.controllers.PropertyController2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/* ./ для поиска на уровень выше, а не там где находится класс*/
@ComponentScan("com/hunt/lesson_13_dop")
public class PropertyTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles();
        context.register(PropertyTest2.class);
        context.refresh();

        PropertyController2 propertyController2 = (PropertyController2) context.getBean("propertyController2");
        propertyController2.sayHello();

        InjectSpel injectSpel = (InjectSpel) context.getBean("injectSpell");
        System.out.println(injectSpel);
    }
}
