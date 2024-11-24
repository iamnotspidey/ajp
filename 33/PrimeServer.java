import java.io.*;
import java.net.*;

public class PrimeServer {
    public static void main(String[] args) throws Exception {
        
        ServerSocket s = new ServerSocket(1234);
        System.out.println("Server is running...");

        while (true) {
            Socket socket = s.accept(); // Wait for a client
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            int number = Integer.parseInt(input.readLine()); // Read number from client
            if (number > 1 && isPrime(number)) {
                output.println("Prime");
            } else {
                output.println("Not Prime");
            }

            socket.close(); // Close connection with client
        }
    }

    // Simple function to check if a number is prime
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
