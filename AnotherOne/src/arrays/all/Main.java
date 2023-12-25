package arrays.all;

public class Main {

	public static void main(String[] args) {
		
		String myName = "Bob";
		char[] chars = myName.toCharArray();
		for(int i=0;i<chars.length;i++) {
			System.out.println(chars[i]);
		}
			
		String upperCase = myName.toUpperCase();
		
		System.out.println(upperCase);
	}

}
