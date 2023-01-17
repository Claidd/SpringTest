//package com.hunt.lesson_8_fabrica;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;
//
//public class BinTest {
//    public static void main(String[] args) {
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\Java\\SpringTest\\src\\main\\resources\\spring\\configBean.xml"));
//        HelloBean helloBean = factory.getBean("hello", HelloBean.class);
//        helloBean.seyHello();
//    }
//}
