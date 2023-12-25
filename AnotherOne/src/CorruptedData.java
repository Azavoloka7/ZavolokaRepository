public class CorruptedData {
  public static String getValue(String dataFromDatabase) {
		
	  int indexOf = dataFromDatabase.indexOf('=');
		
		String subString = dataFromDatabase.substring(indexOf+1);
		return subString.toLowerCase();
	}

	
	public static void main(String[] args) {
		
		System.out.println(getValue("name=joHN")); // john
		System.out.println(getValue("language=JAVA"));// java
		System.out.println(getValue("occupation=DeveLOPeR"));// developer
		System.out.println(getValue("login=Me=cOol!!1")); //me=cool!!1
	}

}
