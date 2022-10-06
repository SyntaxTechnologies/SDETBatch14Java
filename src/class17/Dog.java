package class17;

public class Dog {
   private String name;
   private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge>30){
            System.out.println("Please enter a valid value");
        }else {
            age=dogAge;
        }

        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("name "+name+" "+" breed "+" age "+age);
    }

    public static void main(String[] args) {
       /* Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;*/
        Dog dog=new Dog("Tomy","Huskey","Pink",50,30);

        dog.printInfo();

      /*  Dog dog2=new Dog();
        dog2.name="Cmi";
        dog2.breed="German";
        dog2.color="Green";
        dog2.age=12;
        dog2.weight=30;*/
        Dog dog2=new Dog("Cmi","German","Green",12,30);
        dog2.printInfo();

    }
}
