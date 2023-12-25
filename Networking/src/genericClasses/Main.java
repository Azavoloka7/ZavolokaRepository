package genericClasses;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		MyGenericClass<Integer,String> myInt = new MyGenericClass<>(1,"Hola, seniorita!");
		MyGenericClass <Double,Double>myDouble = new MyGenericClass<>(2.7,3.14);
		
		
    //  ArrayList<String> friends = new ArrayList<>();
	//	HashMap<Integer,String> users = new HashMap<>();
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
	
	}

}
