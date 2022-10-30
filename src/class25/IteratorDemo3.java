package class25;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {
        // delete all the products which start with letter B or ends with letter a
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        /*
         var number=10;
        var name="Tymur";
        var decimalNumber=21.5;
         */
        var iterator = beautyProducts.iterator();

        while (iterator.hasNext()){
           // var item=iterator.next(); java 11
            String item=iterator.next();
            if(item.startsWith("B")||item.endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);


    }
}
