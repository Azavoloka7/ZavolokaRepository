package arrays.all;
import java.util.*;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add ("apple");
		fruitList.add ("ananas"); 
		fruitList.add("cherry");
		fruitList.add("kiwi");
		fruitList.add("watermelon");
		
		System.out.println(fruitList);  //[apple, ananas, cherry, kiwi, watermelon]
		
		
		System.out.println(fruitList.add("orange")); //true
		
		
		fruitList.addFirst("strawberry"); 
		System.out.println(fruitList); // [strawberry, apple, ananas, cherry, kiwi, watermelon, orange]
		
		;
		System.out.println(fruitList.remove(4)); //kiwi
		
		;
		System.out.println(fruitList.remove("cherry")); //true
		
		System.out.println(fruitList.size()); //5
		
		
	}

}
