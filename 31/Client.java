import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9876); // Connect to server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // Get credentials from user using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Send credentials to the server
        out.println(userId + "," + password);

        // Receive and print server response
        System.out.println(in.readLine());

        socket.close(); // Close the connection
        scanner.close(); // Close the scanner
    }
}
