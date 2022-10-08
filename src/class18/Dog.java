package class18;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;
    double height;


    public Dog(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public Dog(String name, String breed, String color, int age, double weight, double height) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        this(name, breed, color, age, weight);
        this.height = height;
    }


}
