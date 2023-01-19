package com.hunt.lesson_16_revers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*Мы можем сперва создать контекст, а потом уже внедрять бины туда
* Первый метод - инит, метод инициализации*/
public class MainRevers {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx1 = new GenericXmlApplicationContext("spring/lesson15-1.xml");
        GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext("spring/lesson15-2.xml");

        /*Обратный вызов с поздней инициализацией через файл xml*/
        SimpleBean simpleBean1 = getBean("simpleBean1", ctx1);
        SimpleBean simpleBean2 = getBean("simpleBean2", ctx1);
        SimpleBean simpleBean3 = getBean("simpleBean3", ctx1);
        System.out.println("");
        System.out.println("");
        /*Обратный вызов с поздней инициализацией через аннотацию в классе InitializingBean */
        SimpleBeanWithInterface simpleBeanWithInterface1 = getBeanWithInterface("simpleBean1", ctx2);
        SimpleBeanWithInterface simpleBeanWithInterface2 = getBeanWithInterface("simpleBean2", ctx2);
        SimpleBeanWithInterface simpleBeanWithInterface3 = getBeanWithInterface("simpleBean3", ctx2);
        System.out.println("");



        /*Метод дестрой необходим для отчистки памяти, освобождения ресурсов после удаления бина*/
        SimpleBean simpleBean4 = ctx1.getBean("simpleBean1", SimpleBean.class);
        System.out.println("Before call destroy");
//        ctx1.stop();
        ctx1.close();/*Если ставим клоуз то спринг автоматически вызовет метод дестрой*/
        System.out.println("After call destroy");
        System.out.println("");

        /**/
        SimpleBeanWithInterface simpleBean5 = ctx2.getBean("simpleBean1", SimpleBeanWithInterface.class);
        System.out.println("Before call destroy");
        ctx2.close();
        System.out.println("After call destroy");

    }
    private static SimpleBean getBean(String beanName, ApplicationContext ctx){
        try {
            SimpleBean simpleBean = (SimpleBean) ctx.getBean(beanName);;
            System.out.println(simpleBean);
            return simpleBean;
        } catch (BeanCreationException e) {
            System.out.println("Error create bean");
            return null;
        }

    }

    private static SimpleBeanWithInterface getBeanWithInterface(String beanName, ApplicationContext ctx2){
        try {
            SimpleBeanWithInterface SimpleBeanWithInterface = (SimpleBeanWithInterface)ctx2.getBean(beanName);;
            System.out.println(SimpleBeanWithInterface);
            return SimpleBeanWithInterface;
        } catch (BeanCreationException e) {
            System.out.println("Error create bean");
            return null;
        }
    }


}
