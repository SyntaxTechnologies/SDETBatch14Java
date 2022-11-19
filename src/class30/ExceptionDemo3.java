package class30;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            String name=null;
           // System.out.println(name.length());  // line that contains issues
            System.out.println("code in the try block");
        }catch (Exception anibar){
            System.out.println("Send an email to the Friadoon that your application has some kind of issues");
        }

        System.out.println("some important lines of code 1");
        System.out.println("some important lines of code 2");
        System.out.println("some important lines of code 3");
        System.out.println("some important lines of code 4");


        System.out.println("some important lines of code 5");
        System.out.println("some important lines of code 6");
        System.out.println("some important lines of code 7");
    }
}
