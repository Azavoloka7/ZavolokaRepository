public class RemoveOddChars {
  public static String removeOddChars(String originalString) {
    // write your code below this line
    StringBuilder builder = new StringBuilder();
    for (int i=0; i<originalString.length();i++) {
    	if (i % 2 == 0) {
    		builder.append(originalString.charAt(i));
    	}
    }
    return builder.toString();
    // write your code above this line
  }
	
	

	public static void main(String[] args) {
		
	System.out.println(removeOddChars("1234"));	//13
	}

}
