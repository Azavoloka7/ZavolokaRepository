package chatGPT;

import java.io.*;
import java.net.*;

public class GameServer {
    private ServerSocket serverSocket;

    public GameServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                Socket playerSocket = serverSocket.accept();
                new PlayerHandler(playerSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class PlayerHandler extends Thread {
        private Socket playerSocket;
        private BufferedReader reader;
        private PrintWriter writer;

        public PlayerHandler(Socket socket) {
            this.playerSocket = socket;
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String playerName = reader.readLine();
                System.out.println("Player " + playerName + " connected.");

                while (true) {
                    String message = reader.readLine();
                    if (message == null) {
                        break;
                    }

                    // Process drag message
                    String[] parts = message.split(":");
                    String draggedElement = parts[0];
                    String dragDetails = parts[1];

                    // Send the drag message to other players
                    broadcastMessage(playerName + ":" + draggedElement + ":" + dragDetails);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    playerSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcastMessage(String message) {
            // Implement logic to broadcast the message to other players
            // You can keep a list of connected players and send the message to each one
        }
    }

    public static void main(String[] args) {
        GameServer gameServer = new GameServer(9909);
        gameServer.start();
    }
}
