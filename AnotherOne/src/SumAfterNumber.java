public class SumAfterNumber {
  public static int getSum(int[] values, int startValue) {
    boolean startValueFound = false;
    int finalValue=0;
    for (int i = 0; i < values.length-1; i++) {
      if (values[i] == startValue) {
        startValueFound = true;
        
      }
      if (startValueFound) {
        finalValue += values[i+1];
      }
    }
    if (!startValueFound) {
      return 0;
    }
    return finalValue;
  }

  public static void main(String[] args) {
	  
    System.out.println(getSum(new int[] {1, 2, 3}, 1)); // 2 + 3 = 5
    System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, 50)); // 3 + 4 + 0 = 7
    System.out.println(getSum(new int[] {10, 2, 50, 3, 4, 0}, -100)); // 0 (бо в масиві немає значення -100)
    System.out.println(getSum(new int[] {10}, 10)); // 0
  }
}
