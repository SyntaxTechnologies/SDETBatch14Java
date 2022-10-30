package class25;

import java.util.ArrayList;

public class ContainsAllDemo {
    public static void main(String[] args) {

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("eyeLinear");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");

 /*       System.out.println(beautyProducts.contains("lipstick"));
        System.out.println(beautyProducts.contains("Mascara"));
        System.out.println(beautyProducts.contains("eyeLinear"));*/

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");

        System.out.println(beautyProducts.containsAll(cosmetics));

    }
}
