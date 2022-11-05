package class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
     /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.

         */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water"); //replace
            }
        }
        System.out.println(drinks);


    }
}
