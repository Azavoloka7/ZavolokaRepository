public class DetectWerewolf {
	public static boolean isWerewolf(String target) {
	
	if (target.isEmpty()){
			return true;
			
		}
	else 
		{

			StringBuilder builder = new StringBuilder(target);
			System.out.println(builder);
			StringBuilder reversedOne = builder.reverse();	
			System.out.println(reversedOne);
			
		return (target.contains(reversedOne));	
		}
	}
	
		
	
			public static void main(String[] args) {


				String message1 = "i love java";
				String message2 = "home";
				String message3 = "racecar";

				System.out.println(isWerewolf(message1)); // false
				System.out.println(isWerewolf(message2));// false 
				System.out.println(isWerewolf(message3));// true

			}

		}