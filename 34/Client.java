import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(); // Client socket
        InetAddress serverAddress = InetAddress.getByName("localhost"); // Server address (localhost for now)
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Send message to server
            System.out.print("Client: ");
            String clientMessage = sc.nextLine();
            DatagramPacket sendPacket = new DatagramPacket(
                    clientMessage.getBytes(), clientMessage.length(),
                    serverAddress, 9876 // Server is listening on port 9876
            );
            socket.send(sendPacket);

            // Receive reply from server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String serverMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Server: " + serverMessage);
        }
    }
}
