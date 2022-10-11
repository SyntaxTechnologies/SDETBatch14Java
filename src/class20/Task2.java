package class20;

public class Task2 {

    /*
    HW2: Write program to inherit class Z that has method printF
    which is static and call or reuse that method into class W
     */
    public static void main(String[] args) {
        Z.printF();
        W.printF();
    }

}
class Z{

    static void printF(){
        System.out.println("F");
    }
}
class W extends Z{

}