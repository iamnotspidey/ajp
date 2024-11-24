import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PrimeClient {
    public static void main(String[] args) throws Exception {
        // Connect to the server on localhost and port 1234
        Socket socket = new Socket("localhost", 1234);

        // Set up input and output streams
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner = new Scanner(System.in);

        // Get number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Send the number to the server
        output.println(number);

        // Receive and display the response from the server
        System.out.println("Server says: " + input.readLine());

        // Close the connection
        socket.close();
    }
}
