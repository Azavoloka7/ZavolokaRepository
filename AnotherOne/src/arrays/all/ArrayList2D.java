package arrays.all;

import java.util.ArrayList;

public class ArrayList2D {

	public static void main(String[] args) {
		
		ArrayList<String> fruitList1 = new ArrayList<String>();
		fruitList1.add ("apple");
		fruitList1.add ("ananas"); 
		fruitList1.add("kiwi");
		
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add ("cherry");
		fruitList.add ("watermelon"); 
		fruitList.add("lemon");
		
		ArrayList<String> newFruitList = new ArrayList<String>();
		
		newFruitList.addAll(fruitList);
		newFruitList.addAll(fruitList1);
		
		System.out.println(newFruitList.get(5));

	}

}
