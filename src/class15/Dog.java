package class15;

public class Dog {
    String name; //instance
    static int noOfLegs=4;

    void bark(){
        int i=10; //local
        for (int j = 0; j < i; j++) {
            //int j is also a local variable
            System.out.println("Barking....");
        }
    }


    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
    }
}
