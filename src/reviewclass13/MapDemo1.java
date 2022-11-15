package reviewclass13;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        // I want a method that takes a map and returns a set containing all the keys from that map

        TreeMap<String,Double> items=new TreeMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
        List<String> keys=getKeys(items);
        for (var key:keys
             ) {
            System.out.println(key);
        }

       List<Double> values= getValues(items);
        System.out.println(values);
    }

    public static List<String> getKeys(Map<String,Double> map){

        return new ArrayList<>(map.keySet());
    }

    public static List<Double> getValues(Map<String,Double> sholpan){

        return new ArrayList<>(sholpan.values());
    }



}
