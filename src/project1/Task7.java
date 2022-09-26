package project1;

public class Task7 {

	// Write a java program to check whether a given number is prime or not?

	public static void main(String[] args) {
		int num = 214515475;
		boolean isPrime=true;
		if (num > 1) {
			
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}

		if(isPrime) {
			System.out.println(num+" is Prime");
		}else {
			
			System.out.println(num+" is not Prime");
		}
		
	}
}
