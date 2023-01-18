package com.hunt.lesson_15_maplist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component("injectCollectionAnnotation")
public class CollectionTestAnnotation {

    /*В старых версиях обычно через аннотацию ресурс используют или автовайред и указывать значение*/
    @Value("#{map}")
    private Map<String, Object> map;
    @Value("#{props}")
    private Properties props;
    @Value("#{set}")
    private Set<String> set;
    @Value("#{list}")
    private List<String> list;


    public void displayInfo(){
        System.out.println("Map content:");
        for (Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("__________________________________________________________________");

        System.out.println("Property countries");
        for (Map.Entry<Object, Object> entry : props.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("__________________________________________________________________");

        System.out.println("Set contents");
        for (Object obj : set){
            System.out.println("Value: " + obj);
        }
        System.out.println("__________________________________________________________________");

        System.out.println("List contents");
        for (Object obj : list){
            System.out.println("Value: " + obj);
        }
        System.out.println("__________________________________________________________________");
    }

}
