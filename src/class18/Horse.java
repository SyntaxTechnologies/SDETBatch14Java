package class18;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name,String breed,int age,double weight){
        this.name=name;
        this.breed=breed;
        this.age=age;
       this.weight=weight;
    }

    void printInfo(){
        String name="now this will be printed";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }

    public static void main(String[] args) {
        Horse horseObject=new Horse("Sprit","Stallion",20,400);
        horseObject.printInfo();
    }

}
