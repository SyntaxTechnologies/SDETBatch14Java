package class25;

import java.util.ArrayList;

public class GenericCollection {
    public static void main(String[] args) {

    // Non-generic way of using collections framework this is how your ancestors use to write code before java
        // 1.5 it causes a lot of problems at run time because java don't know at compile time what type of data
        //you are storing in this class and because java does not know it can't help you avoid these errors
        ArrayList names=new ArrayList();
        names.add("Serhi");
        names.add(10);
       // System.out.println(names);

        System.out.println(((String)names.get(0)).length());
    }
}
