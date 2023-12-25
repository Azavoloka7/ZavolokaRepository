package javaInheritance;

public class Main {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(15, 10);
		MountainBike mountainBike = new MountainBike(20, 20, 1);
		System.out.println("Gear is: "+mountainBike.getGear());
		System.out.println("Seat height is: "+mountainBike.getSeatHeight());
		System.out.println("Bike speed is: "+mountainBike.getSpeed());
		mountainBike.applyBrake(5);
		System.out.println("Bike speed after applying break is: "+mountainBike.getSpeed());
		 mountainBike.speedUp(5);
		
		System.out.println(mountainBike.speed);
		bicycle.speedUp(5);
		
		System.out.println(bicycle.speed);
	}

}
