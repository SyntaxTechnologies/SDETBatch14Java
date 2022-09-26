package project1;

public class Task3 {

	public static void main(String[] args) {
		
		/*
         * Create a 2D array of integer values. Print the sum of all numbers
         */
		//Break till 9:00 AM 
		
		int [][] arr= {
				
				{10,10,10,20},
				{25,30,54},
				{20,30}
		};
		
		int sum=0;
		
		for(int[] ar:arr) {
			
			for(int num:ar) {
				sum+=num;
				
			}
			
		}
		System.out.println(sum);
		
	}

}
