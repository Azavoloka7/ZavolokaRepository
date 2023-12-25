package fullJavaProject3;

public class Main {

	public static void main(String[] args) {
		
	Car car = new Car ();
	Boat boat = new Boat();
	Bicycle bicycle = new Bicycle();
	
	Vehicle[] racers = {car, boat, bicycle};
		for(Vehicle x: racers) {
			x.go();
		}
	

	}

}
