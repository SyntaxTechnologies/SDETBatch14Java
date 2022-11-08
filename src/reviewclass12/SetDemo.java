package reviewclass12;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


        /*
        if we don't override equals method in our custom classes most of the collections framework will not
        work properly with those classes
         */
        Set<Student> students=new LinkedHashSet<>(); //upcasting
       students.add(new Student("Josh","plantin","123"));
       students.add(new Student("Saira","Jawad","245"));
       students.add(new Student("Mihan","Kalani","4565"));
       students.add(new Student("Sonam","Koh","100"));
        System.out.println(students);

        List<Student> setStudents=new ArrayList<>(students);
        System.out.println(setStudents.get(1));



    }
}
