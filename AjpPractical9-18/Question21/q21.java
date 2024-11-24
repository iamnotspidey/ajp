/*
 * 1. Check the port for Tomcat 
 * 2. Check if tomcat is runnig properly
 * 3. Create a html with form tag if method is "GET" then ceate a java file and declare a method as "doget()"
 * 4. if Tomcat version is 8 or below use "javax" if greater then 9 then use "jakarta" or simple check the example code which is used in         "HelloWorld" wala code in Tomcat folder
 * 5. Comiple the user java code with using this code `javac -cp "C:\Program Files\Apache Software Foundation\Tomcat 10.1\lib\servlet-api.jar"  JavaCode.java ` if no error good to go.
 * 6. Add the class file in `C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps\examples\WEB-INF\classes`
 * 7. Config the Web.xml link add 
 * 8. Restart the tomcat from service "search service in Application using windows button"
 * 9. Change the action url of HTML form.
 * 10 To check everythin is working properly. 
 *  a. Open browser and search the url.
 *  b. If if show Internal server error everything is working properly.
 *  c. If it show 404 error then again restart the service if still the same it mean something went wrong in web.xml
 *  d. Try again setting up the web.xml if problem still persist . Reedit the web.xml or check ur code
 * 
 */
package Question21;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class q21 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name.equals("Abhinav") && password.equals("123")) {
            out.println("Auth Successful");
        } else {
            out.println("Auth Fail");
        }

    }
}
