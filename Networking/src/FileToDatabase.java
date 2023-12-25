
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileToDatabase {
    public static void main(String[] args) {
        String fileName = "F:\\JSprFrm.txt"; // Вкажіть ім'я вашого файлу
        String databaseUrl = "jdbc:mysql://localhost:3308/texts_db"; // Замініть на свої дані

        try {
            // Зчитування з файлу
            StringBuilder content = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            // З'єднання з базою даних
            try (Connection connection = DriverManager.getConnection(databaseUrl, "root", "Z@v010ka")) {
                // Вставка або оновлення інформації в базі даних
                String sql = "INSERT INTO your_table_name (text_column) VALUES (?) ON DUPLICATE KEY UPDATE text_column = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, content.toString());
                    statement.setString(2, content.toString());
                    statement.executeUpdate();
                }

                System.out.println("Дані збережено в базі даних.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
