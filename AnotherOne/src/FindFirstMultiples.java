public class FindFirstMultiples {
  public static int[] findMultiples(int x, int n) {
    

		if(n==0){
			int[] arrayAnswer = new int[2];
			arrayAnswer[0]=0;
			arrayAnswer[1]=0;
			return arrayAnswer;
		}
		if (x==0) { 
			int[] arrayAnswer = null;
		return arrayAnswer;
		}
		

	
    int[] resultArray = new int[x];
    

    for (int i=1; i<resultArray.length;i++){
    	resultArray[0]=n;	
      resultArray[i]=resultArray[i-1]+n;
    }
    
    return resultArray; 
}		
  public static void main(String[] args) {
	  
	 
	  
	  
  }
}