import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Sample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "admin";
        String password = "1234";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String updateSQL = "UPDATE stud SET NAME = 'John' WHERE NAME = 'Jack'";
            System.out.println("UPDATE stud SET NAME = 'John' WHERE NAME = 'Jack'");
            stmt.executeUpdate(updateSQL);
            System.out.println("Record Updated From Student Table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
