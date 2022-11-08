package reviewclass12;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        /*
        HashMap: Does not retain the order, but it is fastest
        LinkedHasMap : it retains the order, but it is a little slower than hashMap
        TreeMap: when we want to sort the data, but it is slowest
         */

        Map<String,Double> vegeList=new LinkedHashMap<>();
        TreeSet<String> hashSet=new TreeSet<>();
        hashSet.add(null);
        System.out.println(hashSet);


    }
}
