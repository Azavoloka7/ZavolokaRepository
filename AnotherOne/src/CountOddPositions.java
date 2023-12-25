
public class CountOddPositions {
	  public static int countOddPositionChars(String[] array) {
		    
		    int count=0;

		    if (array.length==0){
		      return 0;
		     
		    }
		    if ((array.length==1)&&(array[0].length() % 2==1)) {
		    	return array[0].length()/2+1 ;
		    }

		    for (int i=0;i<array.length;i++){
		      for (int j =0; j<array[i].length();j++){
		    	  
		    	  count+=1;
		        
		        }
		      }
		    if (array.length % 2==0)
		    {
		  
		    	return count/2;
		    }
		    else  {
		    	return count/2+1;
		    }
	  }

	public static void main(String[] args) {
		
		String[] insertText = {"Hello", "world", "from", "array"};
		System.out.println(countOddPositionChars(insertText));
		
	}

}
