import java.sql.*;

public class SimpleDatabaseConnection {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3310/";
        String username = "root";
        String password = "Z@v010ka";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a simple query (select all records from a table)
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            // Process the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // ... Process other columns as needed

                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
