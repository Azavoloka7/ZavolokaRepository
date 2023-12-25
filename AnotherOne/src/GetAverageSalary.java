public class GetAverageSalary {
  public static double getAverageSalary(double[] salaries) {
    // write your code below this line
	  double salaryFond = 0.0;
    if (salaries.length==0){
      return 0.0; } 
    else {
    	 
    	 for(int i=0;i<salaries.length;i++)
    	 {
    		 salaryFond = salaryFond + salaries[i];
    		 
    	 }
    	
    	 
     }
    
    
    return salaryFond/salaries.length;
  }

	public static void main(String[] args) {
	
		getAverageSalary(new double[] {1000.00, 500.00}); // 750.00
		getAverageSalary(new double[] {100.00, 200.00, 300.00}); // 200.00
		getAverageSalary(new double[0]); // 0.00

		
	}

}
