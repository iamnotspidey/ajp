import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876); // Server socket on port 9876
        byte[] receiveData = new byte[1024]; // Buffer to receive data

        System.out.println("Server is ready...");

        while (true) {
            // Receive message from client
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Client: " + clientMessage);

            // Send reply to client
            Scanner scanner = new Scanner(System.in);
            System.out.print("Server: ");
            String serverMessage = scanner.nextLine();
            DatagramPacket sendPacket = new DatagramPacket(
                    serverMessage.getBytes(), serverMessage.length(),
                    receivePacket.getAddress(), receivePacket.getPort()
            );
            socket.send(sendPacket);
        }
    }
}
