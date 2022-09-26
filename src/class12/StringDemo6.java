package class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		String str="I love java programming";
		/*
		 * toCharArray will convert a String to an array of chars
		 */
		//Break till 1:25 
		char[] charArray=str.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]);
		
		int counter=0;
		for(char c:charArray) {
			
			if(c=='a') {
				counter++;
			}
			
		}
		System.out.println("letter a has appread "+counter+" times");
		
	}

}
