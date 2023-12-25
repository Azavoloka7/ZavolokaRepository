package fullJava;

public class StringMethodsTry {

	public static void main(String[] args) {
     
		String name = "     Anatolii    ";
		
		
			System.out.println(name.equalsIgnoreCase("anatolii"));
			
			System.out.println(name.indexOf("i"));
			
		System.out.println(name.charAt(0));
		
		System.out.println(name.trim());
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.replace('a', 'A').trim().toUpperCase());
	}

}
