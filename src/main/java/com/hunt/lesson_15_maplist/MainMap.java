package com.hunt.lesson_15_maplist;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMap {

    public static void main(String[] args) {
//        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//        context.load("spring/app-context-xml.xml");
//        context.refresh();
//
//        CollectionTestXml instance = (CollectionTestXml) context.getBean("collectionTest");
//        instance.displayInfo();

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/app-context-annotation.xml");
        context.refresh();

        CollectionTestAnnotation instance = (CollectionTestAnnotation) context.getBean("injectCollectionAnnotation");
        instance.displayInfo();
    }
}
