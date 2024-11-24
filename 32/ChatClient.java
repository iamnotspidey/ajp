import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1234); // Connect to the server
        System.out.println("Connected to server!");

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        byte[] buffer = new byte[1024];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // To send messages to server

        while (true) {
            // Send message to server
            System.out.print("You: ");
            String clientMessage = reader.readLine();
            output.write(clientMessage.getBytes());

            if (clientMessage.equalsIgnoreCase("exit")) break;

            // Receive message from server
            int bytesRead = input.read(buffer);
            String serverMessage = new String(buffer, 0, bytesRead);
            System.out.println("Server: " + serverMessage);
        }

        socket.close();
    }
}
