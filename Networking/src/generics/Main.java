package generics;

public class Main {

	public static void main(String[] args) {
		
		Integer[] intArray = {1,5,7,13,30};
		Double[] doubleArray = {10.0, 20.0, 100.5, 102.6};
		Character[] charArray = {'a','s', 'd','f','g'};
		String[] stringArray = {"coca-cola", "fanta", "sprite"};
		
	    displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
	}
	
	//Generic methods
	
	public static <T> void displayArray (T[] array) {
		for(T x: array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static <T> T getFirst(T[] array) {
		return array[0];
		
	}
	
}
