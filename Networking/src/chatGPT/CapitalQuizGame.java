package chatGPT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class CapitalQuizGame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel questionLabel, resultLabel;
    private JTextField answerField;
    private JButton submitButton;

    private Map<String, String> capitals;

    private String currentCountry;
    private int score;

    public CapitalQuizGame() {
        super("Capital Quiz Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        capitals = new HashMap<>();
        // Add country-capital pairs to the map
        capitals.put("United States", "Washington");
        capitals.put("United Kingdom", "London");
        capitals.put("France", "Paris");
        // Add more countries and capitals as needed

        questionLabel = new JLabel("What is the capital of ");
        resultLabel = new JLabel("");
        answerField = new JTextField(20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        setLayout(new FlowLayout());

        add(questionLabel);
        add(answerField);
        add(submitButton);
        add(resultLabel);

        askQuestion();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void askQuestion() {
        score = 0;
        for (String country : capitals.keySet()) {
            currentCountry = country;
            questionLabel.setText("What is the capital of " + currentCountry + "?");
            answerField.setText("");
            resultLabel.setText("");
            break; // Show only one question at a time
        }
    }

    private void checkAnswer() {
        String userAnswer = answerField.getText().trim();
        String correctAnswer = capitals.get(currentCountry);

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            resultLabel.setText("Correct! The capital of " + currentCountry + " is " + correctAnswer + ".");
            score++;
        } else {
            resultLabel.setText("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        // Remove the asked question from the map
        capitals.remove(currentCountry);

        // Ask the next question or end the game
        if (!capitals.isEmpty()) {
            askQuestion();
        } else {
            endGame();
        }
    }

    private void endGame() {
        questionLabel.setText("Game Over!");
        resultLabel.setText("Your Score: " + score + " out of " + capitals.size());
        answerField.setEnabled(false);
        submitButton.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CapitalQuizGame());
    }
}
