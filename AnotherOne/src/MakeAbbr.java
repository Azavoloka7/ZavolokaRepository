public class MakeAbbr {
  public static String makeAbbr(String fullName) {
	  String[] words = fullName.split(" ");
	  String finalResult="";;
	  for (int i=0; i<words.length;i++)
	  {
		 finalResult = finalResult + words[i].charAt(0); 
	  }
	  return finalResult.toUpperCase();
  }

	public static void main(String[] args) {
		
	

		System.out.println(makeAbbr("national aeronautics space administration"));
		// "NASA"

		System.out.println(makeAbbr("central processing unit"));
		// "CPU"

		System.out.println(makeAbbr("simplified molecular input line entry specification"));
		// "SMILES"
}
	}
