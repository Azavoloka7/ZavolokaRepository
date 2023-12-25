package fullJavaDynamicPoly;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Animal animal;
	
	System.out.println("What animal do you want?");
	System.out.println("Choose: 1=cat or 2=dog");
	
		int choise = scanner.nextInt();
		if (choise==1 ) {
			animal = new Cat();
			animal.speak();
		}
		else if (choise==2) {
			animal = new Dog();
			animal.speak();
			
		}
		else {
			System.out.println("Write coorect number");
		}
		
		
		System.out.println();
		

	}

}
