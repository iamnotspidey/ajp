
// Write a program to demonstrate session tracking using Cookies.(Store user name and email address where email address will be the value )
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class q22 extends HttpServlet{
    public void doGet(HttpRequest request, HttpResponse response) throws IOException{
        PrintWriter out;
        response.setContentType("text/html");
        String Email = request.getParameter("email");
        String Name = request.getParameter("name");

        out.println("Cookie Name:"+Name+"Cookie Value: "+Email);

       Cookie aCookie = null;
        if (cookieName != null && cookieValue != null) {
            aCookie = new Cookie(Name, Email);
            response.addCookie(aCookie);
            out.println("Cookie Added Successfully");
        }
    }
}
