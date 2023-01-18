package com.hunt.lesson_14_anotbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppBeans {

    public static void main(String[] args) {
        /*Регистрируем класс в котором у нас бин*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*1-й способ*/
//        User user = context.getBean(User.class);
        /*2-й способ*/
//        User user = (User) context.getBean("getUser");
        /*3-й способ если задать параметр в аннотации бина у класса*/
//        User user = (User) context.getBean("user");

        /*Можем при создании передавать параметры. Первым идет имя бина, затем значения аргументов*/
        /*При передаче аргументов необходимо делать над бином аннтотацию лэйзи. Так как контекст создается при загрузке
        * и он еще не знает ничего о нашем бине с аргументами, значит создавать его должен при обращении к нему - отложенно*/
        User user = (User) context.getBean("user", "Olga", 20);
        System.out.println(user);
    }
}
