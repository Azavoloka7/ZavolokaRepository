package chatGPT;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GameClient {
    private String playerName;
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public GameClient(String playerName, String serverAddress, int serverPort) {
        this.playerName = playerName;
        try {
            socket = new Socket(serverAddress, serverPort);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            // Send the player's name to the server
            writer.println(playerName);

            // Start a separate thread to listen for messages from the server
            new Thread(this::listenForMessages).start();

            // Main loop for sending drag messages
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Dragged Element: ");
                String draggedElement = scanner.nextLine();
                System.out.print("Drag Details: ");
                String dragDetails = scanner.nextLine();

                // Send the drag message to the server
                writer.println(draggedElement + ":" + dragDetails);
            }
        } finally {
            close();
        }
    }

    private void listenForMessages() {
        try {
            while (true) {
                String message = reader.readLine();
                if (message == null) {
                    break;
                }

                // Process the drag message received from the server
                String[] parts = message.split(":");
                String senderName = parts[0];
                String draggedElement = parts[1];
                String dragDetails = parts[2];

                System.out.println(senderName + " dragged " + draggedElement + " with details: " + dragDetails);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    private void close() {
        try {
            if (socket != null) {
                socket.close();
            }
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Replace "PlayerA" with the desired player name
        GameClient gameClient = new GameClient("Zavoloka", "localhost", 9909);
        gameClient.start();
    }
}
