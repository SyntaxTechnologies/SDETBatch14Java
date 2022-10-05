package class16;

public class Student {
/*
 Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

 */
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Student roman= new Student();
        roman.id="1";
        roman.name="Ivan";
        Student.numberOfStudent++;

        Student sonamKapor= new Student();
        sonamKapor.id="2";
        sonamKapor.name="Sonam";
        Student.numberOfStudent++;

        System.out.println(Student.numberOfStudent);
        System.out.println(Student.numberOfStudent);

    }
}
