package class15;

public class LocalVarDemo {

    static String name="Confused";
    public static void main(String[] args) {
        int number=0;

        System.out.println();
        /*
        local variables are defined inside blocks of code
        and can only be used inside those blocks
         */
        //System.out.println(name);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        {
           int i=0;
        }

       // System.out.println(i);

    }

    void printNumber(){
        int number=4;
        System.out.println(name);
       // System.out.println(number);
        String name="Allan";


    }
}
