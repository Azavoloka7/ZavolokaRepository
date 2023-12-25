package org;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class GuessTheNumberGame extends Application {

    private int targetNumber;
    private Label resultLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Guess the Number Game");

        // Generate a random number between 1 and 100
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;

        // UI components
        Label titleLabel = new Label("Guess the Number!");
        Label instructionsLabel = new Label("Enter a number between 1 and 100:");
        TextField guessTextField = new TextField();
        Button guessButton = new Button("Submit Guess");
        resultLabel = new Label("");

        // Event handler for the guess button
        guessButton.setOnAction(e -> checkGuess(guessTextField.getText()));

        // Layout setup
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(titleLabel, instructionsLabel, guessTextField, guessButton, resultLabel);

        // Scene setup
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void checkGuess(String guess) {
        try {
            int userGuess = Integer.parseInt(guess);

            if (userGuess < 1 || userGuess > 100) {
                resultLabel.setText("Please enter a number between 1 and 100.");
            } else if (userGuess == targetNumber) {
                resultLabel.setText("Congratulations! You guessed the correct number.");
            } else if (userGuess < targetNumber) {
                resultLabel.setText("Try a higher number.");
            } else {
                resultLabel.setText("Try a lower number.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }
}
