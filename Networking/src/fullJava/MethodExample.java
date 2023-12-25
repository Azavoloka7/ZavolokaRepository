package fullJava;

public class MethodExample {	
	static void hello()
	{		
		System.out.println("Hello!");
	}
	public static void hello (String name) 
	{
		System.out.println("Hello, "+name);	
	}
	public static void main(String[] args) 
	{	
		String name = "Anatolii";
		hello();
		hello(name);
	}
}
