// Write a Program to send the username to server and server will send the length of username to client. 
package Question33;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class q33Client {
    public static void main(String[] args)  throws IOException{
        int password;
        Socket s = new Socket("localhost",7777);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        password = sc.nextInt();

        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeInt(password);
        System.out.println("Number sended to Server....");

        DataInputStream in = new DataInputStream(s.getInputStream());
        System.out.println(""+in.readUTF());
    }
    
}
