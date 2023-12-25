package fullJava;

import java.util.ArrayList;

public class BoxingJava {

	public static void main(String[] args) {
		
		   
	     // Autoboxing in a collection
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(1); // Autoboxing

	        // Unboxing from a collection
	        int value = list.get(0); // Unboxing
	        System.out.println(list);

	    Integer var = 10;
	    
	    
	   System.out.println(var.hashCode()); 
	        
	}

}
