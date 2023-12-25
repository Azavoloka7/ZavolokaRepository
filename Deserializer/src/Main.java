import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException, Exception{
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\zavol\\Desktop\\UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream (fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		System.out.println(user.login);
		System.out.println(user.password);
	}

}
