import javax.swing.*;
import java.awt.*;

public class OurGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Feedback Application");
		
		JLabel label = new JLabel("Java X: Learn Java Programming");
		label.setBounds(100, 10, 300, 30);
		label.setFont(new Font("Serif",Font.BOLD,18));
		label.setForeground(Color.BLUE);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo.png");
		imageLabel.setIcon(imageIcon);
		imageLabel.setBounds(100, 50, 300, 300);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(50, 380, 100, 30);
		name.setFont(new Font("Serif", Font.PLAIN, 16));
		
		JTextField textField = new JTextField();
		textField.setBounds(110, 380, 200, 30);
		
		JTextArea textArea = new JTextArea("Your Feedback");
		textArea.setBounds(110, 430, 200, 50);
		
		JButton button = new JButton("Send Feedback");
		button.setBounds(110, 540, 150, 30);
		button.setBackground(Color.BLUE);
		button.setForeground(Color.WHITE);
		
		JLabel result = new JLabel();
		result.setBounds(60, 600, 350, 30);
		result.setFont(new Font("Serif",Font.PLAIN,16));
		
		
		
		frame.setLayout(null);
		frame.add(label);
		frame.add(imageLabel);
		frame.add(name);
		frame.add(textField);
		frame.add(textArea);
		frame.add(button);
		frame.add(result);
		
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		


		frame.add(label);
		frame.add(imageLabel);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
