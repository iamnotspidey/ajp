import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            output.println(username);
            System.out.println("Username sent: " + username);

            String response = input.readLine();
            System.out.println("Length of username: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
