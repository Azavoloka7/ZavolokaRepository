
public class GetMiddleCharacter {
	public static String getMiddleString (String originalString) {
		if (originalString.length()==0)
			return "";
		else if (originalString.length() %2==0){
			String middleOne= originalString.substring(originalString.length()/2-1 , originalString.length()/2+1);
			
			return middleOne;
	}
		
		else if (originalString.length() %2==1) {
			
			char middleOne= originalString.charAt(originalString.length()/2);
			
			String result = Character.toString(middleOne);
			return result;
		}
		return originalString;
		
		
	}	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMiddleString("hello")); // "l"
		System.out.println(getMiddleString("1234")); // "23"
	}

}
