import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started, waiting for client...");

        Socket socket = serverSocket.accept(); // Accept client connection
        System.out.println("Client connected!");

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        byte[] buffer = new byte[1024];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // To send messages to client

        while (true) {
            // Receive message from client
            int bytesRead = input.read(buffer);
            String clientMessage = new String(buffer, 0, bytesRead);
            System.out.println("Client: " + clientMessage);

            if (clientMessage.equalsIgnoreCase("exit")) break;

            // Send message to client
            System.out.print("Server: ");
            String serverMessage = reader.readLine();  // Read server's message
            output.write(serverMessage.getBytes());

            if (serverMessage.equalsIgnoreCase("exit")) break;
        }

        socket.close();
        serverSocket.close();
    }
}
