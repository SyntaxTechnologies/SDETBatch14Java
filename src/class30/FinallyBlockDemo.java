package class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {

        try{
           // System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Operation not allowed");
            String name=null;
           System.out.println(name.length());
        }finally {
            System.out.println("This Block is always executed no matter what");
        }

        System.out.println("1");
    }
}
