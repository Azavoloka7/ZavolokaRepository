package fileExample;

import java.io.*;

public class Shani {
  public static void main(String[] args) throws Exception {
    File testfile = new File("C:\\Users\\zavol\\eclipse-workspace\\Networking\\secret_message.txt");
    BufferedReader br = new BufferedReader(new FileReader(testfile));
    String z;
    while ((z = br.readLine()) != null) System.out.println(z);
  }
}