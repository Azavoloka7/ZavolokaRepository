public class MarkStringEnds {
	public static String[] markStringEnds(String input) {	

		if (input.length()==0){
			return null;
		}else{
			String[] unswer = new String[2];
			
			StringBuilder res1 = new StringBuilder(input);
			res1.setCharAt(0, Character.toUpperCase(input.charAt(0)));
			StringBuilder res2 = new StringBuilder(input);
			res2.setCharAt(input.length()-1, Character.toUpperCase(input.charAt(input.length()-1)));
		 
			unswer[0]=res1.toString();
			unswer[1]=res2.toString();
		
			return  unswer;
		 
		}
		

	}

public static void main(String[] args) {
	
String word = "champion";
String[] array = new String[2];



array[0]= markStringEnds(word)[0];
array[1]= markStringEnds(word)[1];

System.out.println(word+" "+array[0]+" "+array[1]);

}


}
