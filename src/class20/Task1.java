package class20;

public class Task1 {
    /*Write program for multilevel inheritance
    where class C inherits from class B and Class B inherits from Class A.
     */


    public static void main(String[] args) {
      //  C c=new C();
        B b=new B();
    }
}

class A{
A(){
    System.out.println("A");
}
}
class B extends A{
B(){
    System.out.println("B");
}
}

class C extends B{
 C(){
     System.out.println("C");
 }
}