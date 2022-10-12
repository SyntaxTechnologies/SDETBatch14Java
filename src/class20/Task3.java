package class20;

public class Task3 {
    /*
    Write a Java program called Teacher.
    Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
     Test all 4 classes.
     */

}

class Teacher {
    protected String name;
    protected int age;
    protected int yearsOfExperience;
    Teacher(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

// Break till 8:55
    void teach() {
        System.out.println(name + " is teaching");
    }
}

class MathTeacher extends Teacher{

    void teachTheClass(){
        System.out.println("I will teach the class even the world is going to end right after my class");
    }
    MathTeacher(String name,int age,int noOfYear){
      super(name,age,noOfYear);
    }
}

class ChemistryTeacher extends Teacher{

    boolean teachOrganic;
    ChemistryTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }
    void teachChem(){
        System.out.println(name+" teaching Chemistry");
    }
}

class PianoTeacher extends Teacher{

    String pianoType;
    PianoTeacher(String name, int age, int yearsOfExperience,String pianoType) {
        super(name, age, yearsOfExperience);
        this.pianoType=pianoType;
    }



}