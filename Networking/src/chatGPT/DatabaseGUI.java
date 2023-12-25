package chatGPT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DatabaseGUI extends JFrame {
    /**
	 * 666
	 */
	private static final long serialVersionUID = 1L;
	private JTextField idField, nameField, ageField;
    private JButton addButton, removeButton, changeButton, findButton;

    public DatabaseGUI() {
        super("Database GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        idField = new JTextField(10);
        nameField = new JTextField(10);
        ageField = new JTextField(10);

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        changeButton = new JButton("Change");
        findButton = new JButton("Find");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRecord();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeRecord();
            }
        });

        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeRecord();
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findRecord();
            }
        });

        setLayout(new FlowLayout());

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Age:"));
        add(ageField);
        add(addButton);
        add(removeButton);
        add(changeButton);
        add(findButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://your_database_url:3308/accountdata";
        String user = "root";
        String password = "Z";
        return DriverManager.getConnection(url, user, password);
    }

    private void addRecord() {
        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO your_table_name (id, name, age) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, Integer.parseInt(idField.getText()));
                statement.setString(2, nameField.getText());
                statement.setInt(3, Integer.parseInt(ageField.getText()));
                statement.executeUpdate();
                clearFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removeRecord() {
        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM your_table_name WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, Integer.parseInt(idField.getText()));
                statement.executeUpdate();
                clearFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error removing record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void changeRecord() {
        try (Connection connection = getConnection()) {
            String sql = "UPDATE your_table_name SET name = ?, age = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nameField.getText());
                statement.setInt(2, Integer.parseInt(ageField.getText()));
                statement.setInt(3, Integer.parseInt(idField.getText()));
                statement.executeUpdate();
                clearFields();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error changing record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void findRecord() {
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM your_table_name WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, Integer.parseInt(idField.getText()));
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        nameField.setText(resultSet.getString("name"));
                        ageField.setText(String.valueOf(resultSet.getInt("age")));
                    } else {
                        JOptionPane.showMessageDialog(this, "Record not found", "Not Found", JOptionPane.INFORMATION_MESSAGE);
                        clearFields();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error finding record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        ageField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DatabaseGUI());
    }
}
