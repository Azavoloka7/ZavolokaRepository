package chatGPT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountRegistration {

   
    private static final String JDBC_URL = "jdbc:mysql://localhost:3308/accountData";
    
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Z@v010ka";


    private static final String INSERT_ACCOUNT_QUERY =
            "INSERT INTO accounts (username, password, email) VALUES (?, ?, ?)";

    public static void main(String[] args) {

        String username = "vlad";
        String password = "12345";
        String email = "vlad@never.com";

  
        boolean registrationSuccess = registerAccount(username, password, email);

        if (registrationSuccess) {
            System.out.println("Account registration successful!");
        } else {
            System.out.println("Account registration failed.");
        }
    }

    public static boolean registerAccount(String username, String password, String email) {
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");

   
            try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
     
                try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT_QUERY)) {
       
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, email);

  
                    int rowsAffected = preparedStatement.executeUpdate();

             
                    return rowsAffected > 0;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
