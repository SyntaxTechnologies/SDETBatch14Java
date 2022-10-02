package class15;

import java.util.Scanner;

public class Task1 {
    /*
    Create a method that will take 2
parameters as a numbers and prints which
number is larger
     */
    void printLarger (int num1,int num2){
        if(num1>num2){
            System.out.println("Number 1 is larger "+num1);
        }else if(num2>num1){
            System.out.println("Number 2 is larger "+num2);
        }else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the first Number");
        int number1 = scanner.nextInt();
        System.out.println("Please Enter the second Number");
        int number2 = scanner.nextInt();
        Task1 task1=new Task1();
        task1.printLarger(number1,number2);
        task1.printLarger(50,12);

    }
}
