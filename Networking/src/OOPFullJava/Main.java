package OOPFullJava;

public class Main {
	
	
	public static void main(String[] args) {
		String name="Valera";
		int age=34;
		int heigth=190;
		
	Human human = new Human("Vlad", 34, 187);
	

	System.out.println(human.name);
	System.out.println(human.age);
	System.out.println(human.heigth);
	
	Human humanNew = new Human(name, age, heigth);
	System.out.println();
	System.out.println(humanNew.name);
	System.out.println(humanNew.age);
	System.out.println(humanNew.heigth);
	
	humanNew.eat();
	human.eat();
	
	human.drink();
	}

}
