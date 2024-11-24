import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is running...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String username = input.readLine();
            if (username != null) {
                int length = username.length();
                output.println(length);
                System.out.println("Username received: " + username + " | Length sent: " + length);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
