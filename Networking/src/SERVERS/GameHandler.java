package SERVERS;

import java.io.*;
import java.net.Socket;

public class GameHandler implements Runnable {
    private Socket clientSocket;

    public GameHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());

            // Handle game logic here

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
