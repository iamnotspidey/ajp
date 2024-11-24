import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get parameters from the request
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Generate and send the response
        response.getWriter().println("<h1>Details Received:</h1>");
        response.getWriter().println("<p><strong>Name:</strong> " + name + "</p>");
        response.getWriter().println("<p><strong>Email:</strong> " + email + "</p>");
    }
}
