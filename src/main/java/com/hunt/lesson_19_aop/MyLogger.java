package com.hunt.lesson_19_aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyLogger {


    /*В анотации указываем, что перед вызовом обозначенного нами метода в данном случае гетмесседж будет
    * выполнен код который мы прописываем в методе ниже то есть в лог бефор Можно указать конкретный метод ,
    * у конкретного класса com.lesson17.Student а можно сделать универсальную запись со звездочками и указать только название самого метода
    * executoin - точка внедрения.
    * Если указать within - то на методах в этом пакте должен будет запуститься метод ниже.
    */


    /**/
    @Pointcut(value = "execution(* * .getMessage(..))")
    public void logginPointcup(){
    }

    //    @Before("execution(public void getMessage())")
    @Before("logginPointcup()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("This is myLogger.log()");

        /*Можно делать с поинтом и без. Елси с поинтом, то у него можно вызвать доп методы например сигнатур
        * которй возвращает и печатает путь до метода. поинт это объект-область  */
        System.out.println(joinPoint.getSignature());
    }


//    /    @Before("execution(public void getMessage())")
//    @Before(value = "execution(* * .getMessage(..))")
//    public void logBefore(JoinPoint joinPoint){
//        System.out.println("This is myLogger.log()");
//
//        /*Можно делать с поинтом и без. Елси с поинтом, то у него можно вызвать доп методы например сигнатур
//         * которй возвращает и печатает путь до метода. поинт это объект-область  */
//        System.out.println(joinPoint.getSignature());
//    }
    /* После возращения - после выполнения указанного в аннотации метода будет выполнен код который мы прописываем в
    методе ниже, то есть в лог афтер, при чем он будет работать с тем, что вернул предыдущий метод. */

    @AfterReturning(value = "execution(public String getName()) || logginPointcup()",  returning = "retVal")
    /*НА всякий случай ставим объект, так как можем не знать, что метод возвращает */
    public void logAfter(Object retVal){
        System.out.println("__________________________");
        System.out.println(retVal);
        System.out.println("__________________________");
    }



}
