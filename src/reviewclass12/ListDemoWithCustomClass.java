package reviewclass12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("Adam","Park","123"));
        students.add(new Student("Yusuf","Engin","123"));
        students.add(new Student("Cam","Jo","123"));

       // System.out.println(students);

        // coming up next how we can remove elements how we can access methods from a class

       /* for (Student student : students) {
            student.printName();
        }*/

        Student joshAgain=new Student("Josh","Plantin","123");
        System.out.println(students.contains(joshAgain));
        System.out.println(joshAgain);
        System.out.println(students);
    }
}
