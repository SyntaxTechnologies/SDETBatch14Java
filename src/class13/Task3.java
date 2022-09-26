package class13;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads the first name of mother and father
		 *  if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom's
		 * first name? Mary Dad's first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY
		 * 
		 * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
		String motherName;
		String fatherName;
		String babyType;
		String firstHalf;
		String secondHalf;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the name of mother");
		motherName=scanner.next();
		System.out.println("Please Enter the name of father");
		fatherName=scanner.next();
		System.out.println("Are you expecting a boy or girl boy=true girl=false");
		babyType=scanner.next();
		
		if(babyType.equals("boy")) {
			firstHalf=fatherName.substring(0,fatherName.length()/2);
			 secondHalf=motherName.substring(motherName.length()/2);
			
		}else {
			 firstHalf=motherName.substring(0,motherName.length()/2);
			 secondHalf=fatherName.substring(fatherName.length()/2);
			
		}
		System.out.println(firstHalf+secondHalf);
		
	}

}
