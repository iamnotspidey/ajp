// Write a program using URL class to retrieve the host, protocol, port and the file of URL http://www.msbte.org.in 

package Question19;
import java.net.*; 

public class q19 {
    public static void main(String[] args) {
        try {          
            URL url = new URL("http://www.msbte.org.in");

            System.out.println("Protocol: " + url.getProtocol());
           
            System.out.println("Host: " + url.getHost());
           
            int port = url.getPort();
            System.out.println("Port: " + port);
          
            System.out.println("File: " + url.getFile());
        } catch (Exception e) {
        
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
