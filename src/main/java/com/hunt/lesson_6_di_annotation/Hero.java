package com.hunt.lesson_6_di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/* Содаем анатацию компонент, показываем спрингу, что из него можно делать бин*/
/* Autowired - для полей, для конструктора и для методов, указывает спрингу внедрять зависимость на дтем полем где проставлено
* над конструктором можно ставить автовайред, а можно не ставить, так как конструктор сам по себе обязан внедрять
* зависимость. А вот при пусто конструкторе не обязан и поэто будет работать
* Можем так же ставить над методами, которые что-то внедряют, например сеттер (над геттером не нужно)*/
@Component("hero") /*Для уточнения id*/
public class Hero {
    private String name;
    /*Берем именно класс*/
    private Sword sword;
/*Делаем через интерфейс для гибкости и подключения разных классов*/
    private ArmorInteface armor;

    /*Если у нас можно внедрить несколько классов, то необходимо уточнить какой именно через квалифайр,
    * в скобках указать или имя класса, или его ид указанном у аннатации компонента */
@Autowired
    public Hero(@Value("Ivan Hunt") String name, Sword sword,@Qualifier("armor2") ArmorInteface armor) {
        this.name = name;
        this.sword = sword;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", sword=" + sword +
                ", armor=" + armor +
                '}';
    }
}
