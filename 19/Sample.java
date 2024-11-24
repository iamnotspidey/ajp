import java.net.*;
import java.util.*;
public class Sample {
public static void main(String[] args)throws MalformedURLException {
URL url = new URL("https://msbte.org.in/");
System.out.println("Authority: "+url.getAuthority());
System.out.println("Default Port: "+url.getDefaultPort());
System.out.println("File: "+ url.getFile());
System.out.println("Path: "+url.getPath());
System.out.println("Protocol: "+url.getProtocol());
System.out.println("Reference: "+url.getRef());
System.out.println("Host: "+url.getHost());


}
}
