package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");


        ArrayList<String> beautyProducts=new ArrayList<>();
        //adds everything from makeUpItem to beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);
        beautyProducts.remove("lotion");  // removes only one item
        System.out.println(beautyProducts);

        beautyProducts.removeAll(cosmetics);

        System.out.println(beautyProducts);
        beautyProducts.clear(); // removes everything
        System.out.println(beautyProducts);








    }
}
