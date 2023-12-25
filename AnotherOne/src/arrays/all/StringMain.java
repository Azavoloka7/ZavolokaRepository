package arrays.all;

public class StringMain {

	public static void main(String[] args) {
		
		//indexOf
		//We have some String. For example: 'password=abc123' or 'login=bob'
		// Return the value after '='
String password = "password=abc123";
String login = "login=bob";


getValue(password); 
getValue(login);
String passwordValue = getValue(password);
String loginValue = getValue(login);


System.out.println(passwordValue);
System.out.println(loginValue);

	}

	public static String getValue(String input) {
		int indexOf = input.indexOf('=');
		String subString = input.substring(indexOf+1);
		return subString;
	}
	
}
