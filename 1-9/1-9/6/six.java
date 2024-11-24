import java.awt.*;
import javax.swing.*;

public class six extends JFrame {

    six() {
        // Create a GridLayout with 3 rows and 3 columns
        setLayout(new GridLayout(3, 3)); // 3 rows, 3 columns
        
        // Add buttons to the grid
        for (int i = 1; i <= 6; i++) {
            add(new JButton("Button " + i));  // Adding buttons to the grid
        }
        for (int i = 1; i <= 3; i++) {
            add(new JLabel("label " + i));  // Adding buttons to the grid
        }
        // Set frame properties
        setTitle("GridLayout Example");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new six();
    }
}
