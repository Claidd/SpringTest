package com.hunt.lesson_17_beanName;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SimplBean implements BeanNameAware, InitializingBean {
    private String nameBean = null;

    public String getNameBean() {
        return nameBean;
    }

    @Override
    public void setBeanName(String name) {
        this.nameBean = name;
        System.out.println("Setting BeanName.....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization....");
    }

    public static void main(String[] args) {
        /*несколько путей можно добавить в конец дженерикфплик и это будет общим целым просторанством, а можно по
        * одному через лоад и управлять каждым по отдельности*/
        GenericXmlApplicationContext context1 = new GenericXmlApplicationContext();
        context1.load("spring/beans-setting.xml");
        /*Обновляем контекст*/
        context1.refresh();

        SimplBean simplBean = context1.getBean("simplBean", SimplBean.class);
        System.out.println(simplBean.getNameBean());
    }
}
