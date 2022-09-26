package class12;

public class StringDemo4 {
	
	public static void main(String[] args) {
		
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("shah")) {
			System.out.println("I found it");
		}
		/*
		 * equals checks if two Strings are exactly the same with exact same case
		 * equalsIgnoreCase checks if two Strings are exactly the same but does not care about the
		 * case of letters
		 */
		if(str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
		}

		
		
	}

}
