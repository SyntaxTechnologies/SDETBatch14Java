package class13;

public class Task1 {

	/*
    Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters,
    print the character in the middle of the String.
     */
	
	
	
public static void main(String[] args) {
	String str="hello";
	int length=str.length();
	if(!str.isEmpty()&&length%2!=0&&length>=3) {
		
		int middleIndex=length/2;
		System.out.println(str.charAt(middleIndex));
	}
}

//Break till 11:5

}
