public class CombineArrays {
  public static int[] getCombinedArray(int[] firstArray, int[] secondArray) {
    // WRITE YOUR CODE BELOW THIS LINE
	  
	 if((firstArray.length<=0)&&(secondArray.length==0))
	 {
     int[] combined = new int[0];
		 return combined;
	 }
	 else {
		 
		 int combined[] = new int[firstArray.length+secondArray.length];
		 
		 for (int i=0;i<firstArray.length;i++) {
			 combined[i]=firstArray[i];
			 
		 }
		 for (int j=0; j<secondArray.length;j++)
		 {
			 combined[firstArray.length+j]=secondArray[j];
		 }
		  return combined;
	 }
	  
  
    
    // WRITE YOUR CODE ABOVE THIS LINE
  }
	public static void main(String[] args) {
		
		getCombinedArray(new int[] {1, 2}, new int[] {3, 4}); // [1, 2, 3, 4]
		getCombinedArray(new int[] {56}, new int[] {-32}); // [56, -32]
		getCombinedArray(new int[] {}, new int[] {}); // []
		getCombinedArray(new int[] {}, new int[] {20, 10}); // [20, 10]
	}

}