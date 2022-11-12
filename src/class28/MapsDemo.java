package class28;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        //i want to remove the items if their price is more than 10




        //first we are getting a collection of values then an Iterator
     /*      Iterator<Double> iterator=items.values().iterator(); //first we are getting a collection of values then an Iterator

        while (iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }*/

        System.out.println(items);

        items.values().removeIf(price -> price>10);

    }

    /*public boolean check(Double price){
        if (price > 10) {
            return true;
        } else {
            return false;
        }
    }*/
}
