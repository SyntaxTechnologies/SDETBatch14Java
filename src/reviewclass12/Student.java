package reviewclass12;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastName;
    private String rollNumber;


    //Break till 8:50 lol
    public Student(String firstname, String lastName, String rollNumber) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
    }

    void printName(){
        System.out.println(firstname+lastName);
    }

   @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, rollNumber);
    }
}
