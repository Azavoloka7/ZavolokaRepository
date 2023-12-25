public class ReverseString {
  public static String reverseString(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    
    StringBuilder builder = new StringBuilder(input);
    StringBuilder reversedOne = builder.reverse();
    
    return reversedOne.toString();
  }
}
