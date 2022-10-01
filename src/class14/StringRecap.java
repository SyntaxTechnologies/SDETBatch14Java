package class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str="kjfksfAJDSKJD274362374!@##$";
        str= str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = " + str);

        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));

        String str2=" Batch 14 is Great.Batch 14 is Great";
        String replace = str2.replaceFirst("Great", "Good");
        System.out.println(replace);


    }
}
