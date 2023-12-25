import java.util.Arrays;

public class GetHighestAndLowestAge {
  public static int[] getHighestAndLowestAge(int[] ages) {
    // write your code below this line
	int[] result = new int[2];  
    if (ages.length==0)
    {
    	System.out.println("error! сусіди...");
    	
    } else if(ages.length==1) {
    	result[0]=ages[0]; //max
    	result[1]=ages[0]; //min
    	return result;
    	
    }
    else {
    	result[1]=ages[0];
    	for(int i = 0; i<ages.length;i++) {
    		if (result[0]<ages[i]) {
    			
    			result[0]=ages[i];
    			
    		}
    		if (result[1]>ages[i]) {
    			result[1]=ages[i];
    			
    		}
    	}
    	
    }
    
    	
	  
	  
	  
	  
	  return result;
	  
  }
  
  
  

	public static void main(String[] args) {

	System.out.println(Arrays.toString(getHighestAndLowestAge(new int[] {10, 40, 36}))); // [40, 10]
	System.out.println(Arrays.toString(getHighestAndLowestAge(new int[] {60, 4, 14, 20, 97})));	 // [97, 4]
	System.out.println(Arrays.toString(getHighestAndLowestAge(new int[] {35})));	 // [35, 35]
		// бо 35 - це одночасно найбільший та найменший вік
	}
	

}
