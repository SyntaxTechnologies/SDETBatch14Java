package class24;

public class Cat {
    String name;
    String breed;
    int age;
    double weight;


    /*
    Create a horse class
    have 5 fields of your choice
    create constructor and getter setter methods for this class
    atleast write one coniditon inside setter class
     */
    public Cat(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
