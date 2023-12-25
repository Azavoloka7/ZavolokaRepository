public class DivisibleNumbers {
	
  public static int[] getDivisibleNumbers(int[] numbers, int divider) {
    int size = 0;
    for (int number : numbers) {
      if (number > 0 && number % divider == 0) {
        size++;
      }
    }
    
    int[] result = new int[size];
    int counter = 0;
    for (int number : numbers) {
      if (number > 0 && number % divider == 0) {
        result[counter] = number;
        counter++;
      }
    }
    
    return result;
  }

  public static void main(String[] args) {
    int[] numbers = {2, 5, 8, 0, 7, 1, -4};
    int divider = 2;
    int[] res = getDivisibleNumbers(numbers, divider);
    
    for (int number : res) {
      System.out.print(number+" ");
    }
  }
}
