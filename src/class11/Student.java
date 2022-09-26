package class11;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	// Break till 8:56
	
	void study() {
		
		System.out.println(" Student is studying");
	}
	
	void deleteMessages() {
		System.out.println("Deleting messeage from Discord");
	}
	
	void eat() {
		System.out.println("Eating pizzzzzzzzza...");
	}

	
	public static void main(String[] args) {
		//new Student()=> Creates the object of Student class
		Student fraidoonObject= new Student();
		fraidoonObject.name="Friadoon";
		fraidoonObject.id="123";
		fraidoonObject.age=22;
		
		System.out.println(fraidoonObject.name);
		System.out.println(fraidoonObject.age);
		fraidoonObject.deleteMessages();
		fraidoonObject.deleteMessages();
		System.out.println("*******************");
		Student student2=new Student();
		student2.name="Asma";
		student2.age=16;
		student2.weight=30;
		student2.gender='F';
		System.out.println(student2.name);
		student2.eat();
		
	}
}
