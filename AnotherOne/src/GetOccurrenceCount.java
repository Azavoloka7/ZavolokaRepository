
public class GetOccurrenceCount {
  public static int getOccurrenceCount(String[] colors, String targetColor) {
	  int occurrenceCount=0;
    if (colors==null){
      return 0;
    }
    else {
     
      for (int i=0;i<colors.length; i++){
        if (colors[i].equals(targetColor)){
           occurrenceCount=occurrenceCount+1;}
      }
    }
    return occurrenceCount;
  }
        
      
    
  


	public static void main(String[] args) {
		
	System.out.println(getOccurrenceCount(new String[] {"blue", "blue", "blue"}, "blue"));	// 3
		
		System.out.println(getOccurrenceCount(new String[] {"blue", "green", "red"}, "red")); // 1
		
		
		System.out.println(getOccurrenceCount(new String[]  {"blue", "green", "red"}, "white")); // 0
	}

}
