public class GetSuccessRate {
  public static double getSuccessRate(String statistic) {
    if ((statistic.isEmpty())||statistic==null){
      return 0.0;
    }
    double counter = 0.0;  
    for (int i=0;i<statistic.length();i++) 
    {
      
     if ( statistic.charAt(i)=='1')
     {
    	 counter+=1.0;
     }
      	 
     }
    
    
    
    
    return counter / statistic.length();
   
  }

	public static void main(String[] args) {
		
		String examResult = ("11101");
		System.out.println(getSuccessRate(examResult));
		
	

	}

}