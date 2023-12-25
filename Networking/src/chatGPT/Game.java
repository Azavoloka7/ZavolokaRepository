package chatGPT;

import java.util.Random;

public class Game {
    private int secretNumber;
    private int attempts;

    public Game() {
        this.secretNumber = new Random().nextInt(100) + 1; // Number between 1 and 100
        this.attempts = 0;
    }

    public boolean guess(int number) {
        attempts++;
        
        return number == secretNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void resetGame() {
        secretNumber = new Random().nextInt(100) + 1;
        attempts = 0;
    }
}
