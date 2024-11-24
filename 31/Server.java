import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(9876); 
        System.out.println("Server ready...");

        // Predefined credentials
        String correctUserId = "user123";
        String correctPassword = "pass123";

        while (true) {
            Socket clientSocket = serverSocket.accept(); // Accept client connection
            System.out.println("Client connected!");  // Display message when a client connects
            
            Scanner in = new Scanner(clientSocket.getInputStream());  
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String credentials = in.nextLine(); // Read input using Scanner
            String[] parts = credentials.split(",");

            if (parts[0].equals(correctUserId) && parts[1].equals(correctPassword)) {
                out.println("Authentication successful!");
            } else {
                out.println("Authentication failed!");
            }

            clientSocket.close(); // Close connection after authentication
        }
    }
}
