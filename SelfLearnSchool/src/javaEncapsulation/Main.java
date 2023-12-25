package javaEncapsulation;

public class Main {

	public static void main(String[] args) 
	{
		Student student1 = new Student("Maks Murahowskii",33, "Kyiv, wooden massive");
		Student student2 = new Student("Taras Slavych",32, "Truskavets");
		
		
		System.out.println(student1.equals(student2));
		
		Student student3 = student1.clone();
		System.out.println("HashCodes: \n"+"student1 = "+student1.hashCode()+"\nstudent3(clone) = "+student3.hashCode());
		
		System.out.println(student3.toString());
		
	}

}
