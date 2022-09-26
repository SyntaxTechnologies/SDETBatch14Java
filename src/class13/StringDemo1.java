package class13;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		String str="Today is Sunday";
		String str2=new String("Today is Sunday");
		String day=str.substring(9);
		System.out.println(day);
		System.out.println(str.substring(6,8));
		char c=str.charAt(4); //calling the method charAt on str object
		
		
		char[] charArr=str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		//System.out.println(charArr);
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));
		
		
		

	}

}
