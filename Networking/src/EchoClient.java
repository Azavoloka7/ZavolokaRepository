import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EchoClient {
	public static void main(String[] args) {
	try {
		System.out.println("Connecting to Server...");
		Socket socket = new Socket("127.0.0.1", 5000);
		System.out.println("Successfully Connected!");
		
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader reader = new BufferedReader(inputStreamReader);
		PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
		Scanner scanner = new Scanner(System.in);
		BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		System.out.println("Type message: ");
		while ((userInput=stdReader.readLine())!= null) {
			writer.println(userInput);
			System.out.println("Server: "+reader.readLine());
		}
		socket.close();
		scanner.close();
		reader.close();
		writer.close();
		
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}

	}

}