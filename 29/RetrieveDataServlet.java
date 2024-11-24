import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrieveDataServlet")
public class RetrieveDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Retrieve data from the HTML form
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Generate response
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Form Data</title></head>");
        out.println("<body>");
        out.println("<h2>Retrieved Data:</h2>");
        out.println("<p>Selected City: " + city + "</p>");
        out.println("<p>Selected Gender: " + gender + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
