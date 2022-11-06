package class27;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        fruit.put("Banana",12.0);
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

        Collection<String> keySet=fruit.keySet(); //returns all the keys in the form of Set
        System.out.println(keySet);
        Collection<Double> values=fruit.values(); // returns all the values in the form of a collection
        System.out.println(values);









    }
}
