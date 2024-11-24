// Write a Program to send the username to server and server will send the length of username to client. 
package Question33;

import java.net.*;
import java.io.*;

public class q33Server {

    static boolean primeNumber(int num) {

            if( (num == 2) || (num == 3) || (num == 5) || (num == 7) ){
                return true;
            }
           else if ((num % 2 == 0) || (num % 3 == 0) || (num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0) || (num % 9 == 0)) {
                return false;
            } else {
                return true;
            }
        }
    
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("Server Running on port 7777");
            Socket s = ss.accept();
            System.out.println("Client Connected");
    
            DataInputStream in = new DataInputStream(s.getInputStream());
            int num = in.readInt();
            System.out.println("Number Received From client: " + num);
    
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
    
            boolean data = primeNumber(num);

            if(data){
                out.writeUTF(num+ " is a Prime Number");
            }else{
                out.writeUTF(num+ " is not a Prime Number");
            }
            

    }

}
