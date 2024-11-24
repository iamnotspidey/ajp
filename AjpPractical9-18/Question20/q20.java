// Write a program to create a Student table in database and insert a record in the table. ( Create a "Student" table in a database and insert a record into it.) 
package Question20;

import java.sql.*;
import java.util.Scanner;

class CreateTable {
    CreateTable() {
        String DB_URL = "jdbc:mysql://localhost:3306/stud";
        String DB_USER = "root";
        String DB_PASSWORD = "root";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS Student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "Name VARCHAR(255), " +
                    "RollNo INT(2));";

            Statement stmt = conn.createStatement();

            try {
                stmt.execute(createTableQuery);
                System.out.println("Table Create Sucesfully");
            } catch (Exception e) {
                System.err.println(e);
            }
            System.out.println("Connected to DataBase");
        } catch (Exception e) {
            System.err.println("Something Went Wrong");
        }

    }
}

class insertIntoTable {
    insertIntoTable(String Name, int Roll) {
        String DB_URL = "jdbc:mysql://localhost:3306/stud";
        String DB_USER = "root";
        String DB_PASSWORD = "root";
        String Querry = "INSERT INTO STUDENT (Name,Rollno)  Values (?,?);";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

            PreparedStatement stmt = conn.prepareStatement(Querry);
            stmt.setString(1, Name);
            stmt.setInt(2, Roll);
            stmt.executeUpdate();
            System.out.println("Record Inserted");

        } catch (Exception e) {
            System.err.println("Data Cannot be inserted due to: " + e.getMessage());
        }
    }
}

public class q20 {
    public static void main(String[] args) {
        String name;
        int RollNo;
        char choice = ' ';
        Scanner sc = new Scanner(System.in);

        while (choice != '0') {
            System.out.print("1.Create Table\n2.Insert into Table\n0.Exit \nChoice: ");
            choice = sc.next().charAt(0);
            sc.nextLine();
            if (choice == '1') {
                new CreateTable();
            } else if (choice == '2') {
                System.out.print("Enter Roll no: ");
                RollNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                new insertIntoTable(name, RollNo);
            }
        }
    }
}
