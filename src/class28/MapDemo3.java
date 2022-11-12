package class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        Set<String> keys =items.keySet(); // keySet method returns a Set that contains all the keys of a map
       // Collection<String> keys2 =items.keySet();
        for (String key:keys
             ) {
            System.out.println(key);
        }
        //Break till 11:50
        // write code to print all the values from a map using a loop
    }
}
