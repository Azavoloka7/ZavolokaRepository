package OOPFullJava;

public class Human {
	String name;
	int age;
	int heigth;
	Human (String name, int age, int heigth){
		
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		
	}
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking cola");
	}

}
