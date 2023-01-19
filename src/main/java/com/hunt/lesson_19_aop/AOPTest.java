package com.hunt.lesson_19_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
/*Указываем что у нас есть методы, которые потребует внедрения аспектов*/
@EnableAspectJAutoProxy
public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acat = new AnnotationConfigApplicationContext(AOPTest.class);
        StudentJava studentJava = acat.getBean("studentJava", StudentJava.class);
        /*Над этим методом есть аспект, прочитав настройки спринг понял, что есть аспект бефо
        * он выполнит его и потом перейдет к гетмесседж, а афтер будет выполнен после гет нейм*/
        studentJava.getMessage();

        System.out.println("This is main");
        System.out.println("1: " + studentJava.getName());
        System.out.println("This is end main");
    }
}
