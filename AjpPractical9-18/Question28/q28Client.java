// Write a Program to send the username to server and server will send the length of username to client. 
package Question28;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class q28Client {
    public static void main(String[] args)  throws IOException{
        String password;
        Socket s = new Socket("localhost",7777);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Password: ");
        password = br.readLine();

        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF(password);
        System.out.println("Password sended to Server....");

        DataInputStream in = new DataInputStream(s.getInputStream());
        System.out.println(""+in.readUTF());
    }
    
}
