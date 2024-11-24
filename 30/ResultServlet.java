import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set the response content type
        response.setContentType("text/html");

        // Get the marks from the request
        String marksInput = request.getParameter("marks");

        try {
            int marks = Integer.parseInt(marksInput);

            // Check if the student passed or failed
            String result = (marks >= 40) ? "Passed" : "Failed";

            // Display the result
            response.getWriter().println("<h1>Result: " + result + "</h1>");
        } catch (NumberFormatException e) {
            response.getWriter().println("<h1>Invalid input! Please enter a valid number.</h1>");
        }
    }
}
