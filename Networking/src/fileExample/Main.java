package fileExample;
import java.io.File;



public class Main {

	public static void main(String[] args) {
		
		File file = new File("secret_message.txt");
		
if (file.exists()) {
	System.out.println("That file exists");
	System.out.println(file.getPath());
	System.out.println(file.getAbsolutePath());
	System.out.println(file.isFile());
	
	System.out.println(file.toString());
	
	}
else {
	System.out.println("That file does not exist");
}

}

}
