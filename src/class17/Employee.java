package class17;

public class Employee {
  private   String name;
    private String department;
    private double salary;
    private String id;
    private int age;
    private double actualSalary;
    static String companyName="Syntax";

  public  Employee(String empName,String empDepart,double empSalary,int empAge ){
        name=empName;
        department=empDepart;
        salary=empSalary;
        age=empAge;
    }

    void printSalary(){
         actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }

    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("Tax "+tax);
    }


}
