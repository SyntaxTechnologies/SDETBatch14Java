package class28;

import java.util.HashMap;

public class MapDemo5 {

   // var lastname; does not work with instance variables as java can't figure out the data type as there are no values
    // assigned
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        //Set<Map.Entry<String,Double>> entrySet =items.entrySet();
        var entrySet=items.entrySet();
     /*   var dog=new Dog();
        var number=10.2;*/
        System.out.println(entrySet);

        for (var item:entrySet
             ) {
            System.out.println(item);
        }



    }
}
