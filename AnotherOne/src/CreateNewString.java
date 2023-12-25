
public class CreateNewString {
	public static String createNewString(String input) {
		
		
		
		return String.valueOf(input.charAt(1))+String.valueOf(input.charAt(3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Hello!";
		
		System.out.println(createNewString(word));
	}

}
