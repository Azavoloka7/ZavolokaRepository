import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter; 
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("Connecting to Server...");
			Socket socket = new Socket("127.0.0.1",5000);
			System.out.println("Successfully Connected!");
			
			
			//creating input and output streams
			InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
			BufferedReader reader = new BufferedReader(inputStreamReader);
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			
			//creating the standard input stream to accept user input from the keyboard
			BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
			
			//implementing methods to exchange data
			System.out.println("Hey, please enter your name:");
			String userInput = stdReader.readLine();
			writer.println(userInput);
			System.out.println("Server: "+reader.readLine());
			
			
			socket.close();
			reader.close();
			writer.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
