package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //how to store chars in arrayList
        ArrayList<Character> chars=new ArrayList<>(new ArrayList<>(Arrays.asList('E','F')));
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5F);
        floats.add(12f);
        System.out.println(floats);

    }
}
