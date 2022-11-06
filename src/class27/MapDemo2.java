package class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {


        LinkedHashMap<String,Double> beautyProducts=new LinkedHashMap<>();
        beautyProducts.put("Foundation",50.5);
        beautyProducts.put("Blush",20.0);
        beautyProducts.put("Lipstick",10.5);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProducts);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
       // grocery.remove(beautyProducts); Does not work we can't remove all entries from the map
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);

        // Break till 1:45

    }
}
