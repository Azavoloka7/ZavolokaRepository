package fullJavaProfect2;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
	System.out.println("This Fish is hunting");	
		
		
	}

	@Override
	public void flee() {

		System.out.println("This Fish is Fleeing");
	}

	
}
