package class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);


            for(Integer num:numbers){
                System.out.println(num);
            }

        //int => Integer
        // boolean => Boolean
        // byte => Byte
        // double => Double
        // long => Long
        // float => Float
        // char => Character
    }
}
