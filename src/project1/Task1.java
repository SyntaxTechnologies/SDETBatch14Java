package project1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 1) Using Scanner ask the user about the size of the array create an array of
		 * that size. After the array is created, fill the array with numbers, ask the numbers from the user
		 * through console with the help of scanner.
		 * calculate the sum of all numbers stored in above step inside the array.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the size of the array");
		//asks the user for a number
		int size = scanner.nextInt();
		// it creates an array of the above size 
		int[] arr = new int[size];
	
	
		for(int i=0;i<size;i++) {
			System.out.println("Please Enter an int number");
			arr[i]=scanner.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		
		System.out.println("Sum of all the numbers from the Array is "+sum);
		
	}

}
