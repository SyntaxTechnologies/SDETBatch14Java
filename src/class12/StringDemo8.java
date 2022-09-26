package class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		
	}

}
