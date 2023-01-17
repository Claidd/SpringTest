package com.hunt.lesson_9_bean_factory;

//
//
//
//import com.hunt.lesson_9_bean_factory.annotation.ComponentFB;
//
//import java.io.File;
//import java.io.FilenameFilter;
//import java.io.IOException;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.util.Enumeration;
//import java.util.HashMap;
//import java.util.Map;
//
///*Бин фактори должен просканировать пространство имен, папку, найти файлы с которыми может рабоать (по аннатации)
//и сложить в ящик-контекст. Далее когда берем бин, мы обращаемся к нему по ключу и берем значение. значит ключ и объект
//*/
//public class BeanFactory {
//
//    private static Map<String, Object> beanPool = new HashMap<>();
//
//    public BeanFactory(String basePackage){
//        /*Сканирует все пакеты, загуржает все классы.Возвращает enumiration */
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        /*Указываем путь, где искать*/
////        String basePackage = "com.hunt.lesson_9_bean_factory";
//        try {
//            Enumeration<URL> resurses = classLoader.getResources(basePackage.replace(".", "/"));
//            /*Пока там есть элемент мы идем дальше*/
//            while (resurses.hasMoreElements()){
//                File dir = new File(resurses.nextElement().toURI());
//
//                for (File f : dir.listFiles()){
//                    /*Сканируем все фалы и находим те, которые заканчиваются на точка класс*/
//                    if (f.getName().endsWith("class")){
////                       System.out.println(f);
//                        /*Обрезаем лишний путь, чтобы осталось только название класса без класс*/
//                        String fileName = f.getName().substring(0,f.getName().lastIndexOf("."));
////                        System.out.println(fileName);
//
//                        Class classObj = Class.forName(basePackage + "." + fileName);
//                        /*Делаем проверку на наличие анатации компонента*/
//                        if (classObj.isAnnotationPresent(ComponentFB.class)){
//                            Object obj = classObj.newInstance();
//                            /*Добавялем в мап ключем идет имя класса, а значением путь к нему*/
//                            beanPool.put(fileName.toLowerCase(), obj);
//                        }
//
//
//                    }
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (InstantiationException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        beanPool.forEach((key, value) -> System.out.println(key));
//
//        /*После запуска нужно просканировать директорию на наличие бинов и создать их*/
//        /*Передаем каталог*/
//        String path = "D:\\Java\\SpringTest\\src\\main\\java\\com\\hunt\\lesson_9_bean_factory";
//        File dir = new File(path);
//
//        /*Вызываем файл фильтр сканнер для фильтрации файлов. На пример сейчас мы ставим, что файл должен заканчиваться на java*/
//        for (String s : dir.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith("java");
//            }
//        })){
//            System.out.println(s);
//        }
//    }
//
//
//    /* Берем значение по ключу и возвращаем искомый объект. Ключи в мапе всегда уникальны и не повторяются*/
//    public Object getBeanFB(String beanName){
//        return beanPool.get(beanName.toLowerCase());
//    }
//
//    /*Заполнение мапы*/
//
//
//}
