
public class FindSmallestElement {
  public static int findSmallestElement(int[] nums) {
    // WRITE YOUR CODE BELOW THIS LINE
  
 int smallestElement=nums[0];
 
 for (int i=1; i<nums.length;i++) {
	 if (smallestElement>nums[i]) {
		 smallestElement=nums[i];
	 }
	 
 }
    return smallestElement;
    // WRITE YOUR CODE ABOVE THIS LINE
  }

	public static void main(String[] args) {
		int input[] =  {0,4,7,1,6,3,5};
		// TODO Auto-generated method stub
		
 System.out.println(findSmallestElement(input)); 
				


	}

}
