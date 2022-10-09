package class19;

class Parrot extends Bird{
    Parrot(String name,String color,int age,double weight){
        super(name, color, age, weight);
    }
}
class Crow extends Bird{
    boolean isClever;
    Crow(String name,String color,int age,double weight,boolean isClever){
       super(name, color, age, weight);
       this.isClever=isClever;
    }
}
class Sparrow extends Bird{
    Sparrow(String name,String color,int age,double weight){
        super(name, color, age, weight);

    }
}