package chatGPT;

import java.sql.*;

public class CompactGame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3308/game_db";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Z@v010ka";

    private String playerName;
    private int score;

    public CompactGame(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    public void play() {
    	
        score += 10;
        System.out.println("Player: " + playerName + ", Score: " + score);
    }

    public int getScore() {
    	int result=0;
        return result+score;
    }

    public void saveScore() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD)) {
            String insertQuery = "INSERT INTO scores (player_name, score) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, playerName);
                preparedStatement.setInt(2, score);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CompactGame game = new CompactGame("Didovuch");

        for (int i = 0; i < 15; i++) {
            game.play();
        }

        game.saveScore();
    }
}
