public class CodeReview {
  public static int reviewCode(int maxAttempts) {
    //Write code below this line
int solutionAttempts=0;
do {
  solutionAttempts++;
}
while (solutionAttempts<maxAttempts);
return solutionAttempts;
    //Write code above this line
  }



	public static void main(String[] args) {
	System.out.println(reviewCode(10));

	}

}
