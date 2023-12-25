package chatGPT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGameGUI extends JFrame {
    /**
	 * version 0.57
	 */
	private static final long serialVersionUID = 1L;
	private int numberToGuess;
    private boolean gameWon;
    private int numberOfAttempts;

    private JTextField guessField;
    private JButton guessButton;
    private JTextArea resultArea;

    public GuessingGameGUI() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        gameWon = false;
        numberOfAttempts = 0;

        initializeUI();
    }

    private void initializeUI() {
        setTitle("Гра: вгадай число від 1 до 100");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        guessField = new JTextField(10);
        guessButton = new JButton("Відповідь");
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });

        setLayout(new FlowLayout());
        add(new JLabel("Введіть число: "));
        add(guessField);
        add(guessButton);
        add(resultArea);
    }

    private void handleGuess() {
        int userGuess;
        try {
            userGuess = Integer.parseInt(guessField.getText());
        } catch (NumberFormatException ex) {
            resultArea.setText("Будь ласка, введіть коректне число");
            return;
        }

        numberOfAttempts++;

        if (userGuess < numberToGuess) {
            resultArea.setText("Більше! Спробуйте знову.");
        } else if (userGuess > numberToGuess) {
            resultArea.setText("Менше! Спробуйте знову.");
        } else {
            gameWon = true;
            resultArea.setText("Вітаємо! Ви вгадали число за " + numberOfAttempts + " спроб.");
            guessButton.setEnabled(false); // Disable the guess button after winning
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessingGameGUI().setVisible(true);
            }
        });
    }
}
