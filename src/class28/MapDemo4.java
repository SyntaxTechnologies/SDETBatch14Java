package class28;

import java.util.HashMap;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        for (Double value: items.values()
             ) {
            System.out.println(value);
        }

    }
}
