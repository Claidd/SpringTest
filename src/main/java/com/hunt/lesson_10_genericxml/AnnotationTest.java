package com.hunt.lesson_10_genericxml;

import com.hunt.lesson_10_genericxml.test1.Rabbit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*Указываем анатацию и джава будет исать классы там, где находится класс над, которым мы поставили анатацию
* А можно указать в скобках путь к пакету сканирования. Сканирует только тот пакет, где находится,выше не идет, только ниже*/

@ComponentScan
public class AnnotationTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring/annot.xml");


//        Внедрение через дженерик
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load("spring/annot.xml");
//        context.refresh();

        /*Работаем со сканом*/
        /*Нужно передать тот класс в котором есть анатация сканнера */
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationTest.class);
        Rabbit rabbit = (Rabbit) context.getBean("rabbit");
        rabbit.sayHello();
   }
}
