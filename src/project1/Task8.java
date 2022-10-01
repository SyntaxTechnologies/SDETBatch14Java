package project1;

import class11.Phone;

public class Task8 {

	public static void main(String[] args) {
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		// 0 1 1 2 3 5 8 13 21
		

		int previous=0;
		int currentNumber=1;
		int nextNum=0;
		System.out.println(previous);
		System.out.println(currentNumber);
		for(int i=0; i<8;i++) {
			nextNum=previous+currentNumber;
			System.out.println(nextNum);
			previous=currentNumber;
			currentNumber=nextNum;
		}

	}

}
