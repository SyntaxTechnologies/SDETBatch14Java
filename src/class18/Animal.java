package class18;

public class Animal {
  protected   String name;
    String breed;
    int age;
    double weight;

    void printInfo(){
        String name="now this will be printed";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }
}
