//to get the url goto -> mysql cmd line -> Select @@hostname -> Show variables like 'port' -> Select database()
/*Suppose the results of the above commands are:

Hostname: localhost
Port: 3306
Database: test_db
You can form the JDBC URL manually:

jdbc:mysql://localhost:3306/test_db */

import java.sql.*;
import java.util.Scanner;
public class StudentDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "admin";
        String password = "1234";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS STUD ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "dept VARCHAR(100),"
                    + "percentage FLOAT(4))";
            stmt.execute(createTableSQL);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student ID: ");
            int id = scan.nextInt();
            System.out.println("Enter Student Name: ");
            String name = scan.next();
            name = "'" + name + "'";  
            System.out.println("Enter Student Dept: ");
            String dept = scan.next();
            dept = "'" + dept + "'";  
            System.out.println("Enter Student Percentage: ");
            float perc  = scan.nextFloat();
            String insertSQL = "INSERT INTO STUD VALUES (" + id + "," + name + "," + dept + "," +perc + ")";
            stmt.executeUpdate(insertSQL);
            System.out.println("Student table created and record inserted.");
            scan.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}


//NOTE: to run this use normal cmd. DONT USE VS CODE CMD!!!!!!!

/* TO RUN THIS: 

C:\Users\hp\Desktop\mypracs\20>javac -cp .;a.jar StudentDatabase.java

C:\Users\hp\Desktop\mypracs\20>java -cp .;a.jar StudentDatabase
 */
