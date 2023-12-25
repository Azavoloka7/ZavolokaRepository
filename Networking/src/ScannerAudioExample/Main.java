package ScannerAudioExample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException{
		try {
			Clip clipNew = null;
			Scanner scanner = new Scanner(System.in) ;
		
		File file = new File("file_example.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		File file1 = new File("smooth_guitar.wav");
		AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
		Clip clip1 = AudioSystem.getClip();
		clip1.open(audioStream1);
		
		System.out.println("Choise number of song ('1' or '2'):");
		int keyNumber = scanner.nextInt();
		
		if(keyNumber==1) {
			clipNew = clip ;
		} else if (keyNumber==2) {
			clipNew = clip1;
		} else System.out.println("Choose right answer!!!");
		
		
		String response = "";
		
		while (!response.equals("q")) {
			
			System.out.println("Enter 'p' to play music, 's' - to stop playing music, 'q' - to quit the player, 'r' - to reset the playing song, 'c' - to change song");
			System.out.println("Enter Your choise:");
			
			response = scanner.next();
			
			switch (response.toUpperCase()) {
			case ("P"):{
				clipNew.start();
				break;
			}
			case ("S"):{
				clipNew.stop();
				break;
			}
			case ("R"):{
				clipNew.setMicrosecondPosition(0);
				break;
			}
			case ("Q"):{
				clipNew.close();
				break;
			}
			case ("C"):{
				
				System.out.println("Choise number of song ('1' or '2'):");
				int keyNum = scanner.nextInt();
				
				if(keyNum==1) {
					clipNew = clip ;
				} else if (keyNum==2) {
					clipNew = clip1;
				} else System.out.println("Choose right answer!!!");
				
				
				break;
			}
				
				
		
			default:
				clipNew.close();
				System.out.println("Not a vailable response");
			}
		}
		}
			
		

	
		
		
	 catch (IOException e) {
		e.fillInStackTrace();
		
	}
		catch (Exception e) {
			e.fillInStackTrace();
		}
		
		System.out.println("Bye Bye!!!");
		}

}
