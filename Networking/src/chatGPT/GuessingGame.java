package chatGPT;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int numberToGuess;
    private boolean gameWon;
    private int numberOfAttempts;

    public GuessingGame() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        gameWon = false;
        numberOfAttempts = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!gameWon) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                gameWon = true;
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
        scanner.close();
    }

    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.play();
    }
}
