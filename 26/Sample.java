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
            String deleteSQL1 = "delete from product where product_id = 'P1234'";
            String deleteSQL2 = "delete from product where price > 500";
            String deleteSQL3 = "delete from product where price > 500 and product_id= 'P1234'";
            System.out.println("delete from product where product_id = 'P1234'");
            stmt.executeUpdate(deleteSQL1);
            System.out.println("Record Deleted From Product Table");
            System.out.println("delete from product where price > 500");
            stmt.executeUpdate(deleteSQL2);
            System.out.println("Record Deleted From Product Table");

            System.out.println("and for both:");
            stmt.executeUpdate(deleteSQL3);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



/*
 * NOTE:
 * if you face error: "Error: Could not find or load main class Sample"
 * then try compiling without jar file and also try compiling with and without jar file in vs code
 * 
 */

/*
 * 
 *  create table product ( product_id varchar(255), price varchar(255) );
 */
/*
 * INSERT INTO product (product_id, price)
VALUES ('P1232', '400');
 */
/*
 * INSERT INTO product (product_id, price)
VALUES ('P1233', '550');
 */
/*
 * INSERT INTO product (product_id, price) VALUES ('P1234', '650');
 */



 //to get the url goto -> mysql cmd line -> Select @@hostname -> Show variables like 'port' -> Select database()
/*Suppose the results of the above commands are:

Hostname: localhost
Port: 3306
Database: test_db
You can form the JDBC URL manually:

jdbc:mysql://localhost:3306/test_db */






//NOTE: to run this use normal cmd. DONT USE VS CODE CMD!!!!!!!

/* TO RUN THIS: 

C:\Users\hp\Desktop\mypracs\20>javac -cp .;a.jar StudentDatabase.java

C:\Users\hp\Desktop\mypracs\20>java -cp .;a.jar StudentDatabase
 */
