package javaAbstraction;

public class Main {

	public static void main(String[] args) {
		
		GraphicObject circle = new Circle(0, 0, 10);
		
		Rectangle rectangle = new Rectangle(5, 5, 10, 20);
		
		System.out.println(rectangle.area());
		
		
		circle.moveTo(100, 100);
		System.out.println(circle.toString());
		
		rectangle.moveTo(-100, -100);
		System.out.println(rectangle.toString());
		
	
	
		System.out.println("Hashcodes: \n"+"Circle hashCode = "+circle.hashCode()+"\nRectangle hashCode = "+rectangle.hashCode());
		
		System.out.println(circle.toString()+"\n"+rectangle.toString());
			
		};

	}


