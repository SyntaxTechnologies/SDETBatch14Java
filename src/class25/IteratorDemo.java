package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");
        //get the iterator from the list
        Iterator<String> iterator =beautyProducts.iterator();
       /* System.out.println(iterator.hasNext()); // we have one item
        System.out.println(iterator.next()); //it gives us the item and also removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());*/

        //break till 2:01
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
