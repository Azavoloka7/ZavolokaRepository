package arrays.all;

public class CreateNewArray {
	  public static int[] createArray() {
	    int[] numbers = new int[5];
	    for (int i = 0; i < numbers.length; i++) { 
	      numbers[i] = i + 1;
	    }
	    return numbers;
	  }
	  
	  public static void main(String[] args) {
		  
		  int[] arr = new int[5];
		  arr=createArray();
		  for (int number : arr) {
		        // виводимо значення кожного з елементів
		        System.out.println(number);
		    } 
		 
	 }
	  
	}
