package class13;

public class Task2 {

	public static void main(String[] args) {
		/*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */
		String str="Sunday";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		char [] charArr=str.toCharArray();
	
		for(int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
		
	}

}
