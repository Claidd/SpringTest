package com.hunt.lesson_6_di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*Автовайред над конструктором говорит о том, что нужно внести зависимость, но спринг не знает
 как задать какие-то конкретные значения полей.
* Для это используется value*/
@Component("armor")
/* можем показать здесь проперти вместо файла xml если нужно точечно*/
@PropertySource("modelCar.properties")

public class Armor implements ArmorInteface{
    private String title;
    private int defense;

    @Autowired
    /*Делается ссылка на файлик, но через двоеточие для дефолтного значения если такая проперти не будет найдена
    * без ковычек, можем передать список и можно передавать так системные настройки через решетку # */
    public Armor(@Value("${kitel:prosto stroka}") String title, @Value("${deffence}") int defense) {
        this.title = title;
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "title='" + title + '\'' +
                ", defense=" + defense +
                '}';
    }
}
