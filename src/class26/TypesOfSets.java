package class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //There are three types of sets
        /*
        HashSet:
        DownSide=> it does not care about the insertion order
        UpSide => It is the fastest type of Set
         */
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet");
        System.out.println(hashSet);

        //Whenever you need insertion order
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);


        // When ever you need sorted data use TreeSet
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeSet);



    }
}
