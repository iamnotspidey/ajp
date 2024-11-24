// File: UsernameLengthServlet.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UsernameLengthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the username from the request
        String username = request.getParameter("username");
        
        // Calculate the length of the username
        int length = username != null ? username.length() : 0;
        
        // Set response content type
        response.setContentType("text/html");

        // Write the response back to the client
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Username Length</title></head>");
        out.println("<body>");
        out.println("<h1>Username and Length</h1>");
        out.println("<p><strong>Username:</strong> " + username + "</p>");
        out.println("<p><strong>Length:</strong> " + length + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
