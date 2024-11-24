// Write a Program to send the username to server and server will send the length of username to client. 
package Question28;


import java.net.*;
import java.io.*;

public class q28Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server Running on port 7777");
        Socket s = ss.accept();
        System.out.println("Client Connected");

        DataInputStream in = new DataInputStream(s.getInputStream());
        String pass = in.readUTF();
        System.out.println("Password Received From client: " + pass);

        int length = pass.length();

        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        out.writeUTF("length of Password is: "+ length);

    }

}
