package reviewclass12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("Adam","Park","123"));
        students.add(new Student("Yusuf","Engin","123"));
        students.add(new Student("Cam","Jo","123"));

        System.out.println(students);

    }
}
