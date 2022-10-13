package class21;

public class Employee {

    String name;
    double baseSalary=40000;
    double bonus=20000;

    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }

}
class Developer extends Employee{

    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));
    }

}

class Tester extends Employee{

    void calculateSalary(){
        System.out.println(baseSalary+(2*bonus));
    }
}

class OfficeBoy extends Employee{

}

