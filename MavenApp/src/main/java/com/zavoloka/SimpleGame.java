package com.zavoloka;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        int numberToGuess = new Random().nextInt(100) + 1;
        int playerGuess;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();

            if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }

        } while (playerGuess != numberToGuess);

        scanner.close();
    }
}