package com.hunt.lesson_15_maplist;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionTestXml {
    private Map<String, Object> map;
    private Properties props;
    private Set<String> set;
    private List<String> list;


    public Map<String, Object> getMap() {
        return map;
    }
    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    public Properties getProps() {
        return props;
    }
    public void setProps(Properties props) {
        this.props = props;
    }
    public Set<String> getSet() {
        return set;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

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
