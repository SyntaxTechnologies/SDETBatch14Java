package class14;

public class Task5 {
    public static void main(String[] args) {
        /*

         */
        String str="abc";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }

    }
}
