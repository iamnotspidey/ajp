// Write a program to create a table of name of student, percentage and grade of 10 students using JTable.

package Question13;

import javax.swing.*;
import java.awt.*;

class Widget {
    Widget() {
        JFrame frame = new JFrame("Table");

        String[] headers = {"Name", "Percentage", "Grade"};

        String[][] data = {
            {"Student Unkown", "85", "A"},
            {"Student Unkown", "76", "B"},
            {"Student Unkown", "92", "A++"},
            {"Student Unkown", "88", "A+"},
            {"Student Unkown", "80", "A"},
            {"Student Unkown", "73", "B"},
            {"Student Unkown", "90", "A+"},
            {"Student Unkown", "78", "B+"},
            {"Student Unkown", "79", "B+"},
            {"Student Unkown", "86", "A"}
        };

        JTable table = new JTable(data, headers);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setSize(400, 300);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class q13 {
    public static void main(String[] args) {
        new Widget();
    }
}
