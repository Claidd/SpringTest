package com.hunt.lesson_16_revers;

public class SimpleBean {
    private static final String  DEFAULT_NAME = "Luke";
    private String name;
    private int age = Integer.MIN_VALUE;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", age = " + age;
    }
/*Метод запустится когда спринг запустит фабрику, передаст в фабирку все параметры, которым мы как пользователи
* ему отдали и после этого вызовет метод инит*/
    public void init(){
        System.out.println("Initialization bean");
        if (name == null){
            System.out.println("Using default name");
            name = DEFAULT_NAME;
        }
        if (age == Integer.MIN_VALUE){
            throw new IllegalArgumentException(
                    "You must set age properties!!!" + SimpleBean.class
            );
        }
    }

    public void destroy(){
        System.out.println("Into destroy");
    }

}
