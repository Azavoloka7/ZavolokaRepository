public class CountTheMonkeys {
  public static int[] countTheMonkeys(int count) {
    // write your code below this line
    if (count==0) {
    return null;}
    else
    {
    	int[] monkeys = new int[count];
    	for(int i=0; i<count;i++) {
    		monkeys[i]=i+1;
    		System.out.print(monkeys[i]+" ");
    	}
    	System.out.println("");
return monkeys;
    }
	
    
    
    

    
    // write your code above this line
  }

	public static void main(String[] args) {
		countTheMonkeys(5); // [1, 2, 3, 4, 5]
		countTheMonkeys(8); // [1, 2, 3, 4, 5, 6, 7, 8]
		countTheMonkeys(0); // [] (порожній масив)
		// TODO Auto-generated method stub

	}

}
