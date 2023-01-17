package com.hunt.lesson_6_di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Armor2 implements ArmorInteface{

    private String title;
    private int defense;

    @Autowired
    /*Делается ссылка на файлик, но через двоеточие для дефолтного значения если такая проперти не будет найдена
     * без ковычек, можем передать список и можно передавать так системные настройки через решетку # */
    public Armor2(@Value("Knight") String title, @Value("50") int defense) {
        this.title = title;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Armor2{" +
                "title='" + title + '\'' +
                ", defense=" + defense +
                '}';
    }
}
