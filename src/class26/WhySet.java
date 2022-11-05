package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);

        LinkedHashSet<Integer> setNumbers=new LinkedHashSet<>();
        setNumbers.add(10);
        setNumbers.add(10);
        setNumbers.add(10);
        System.out.println(setNumbers);




    }
}
