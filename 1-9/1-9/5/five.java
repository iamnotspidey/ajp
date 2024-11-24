import java.awt.*;
import javax.swing.*;

public class five extends JFrame {
    
    five() {
        // Set BorderLayout for the frame
        setLayout(new BorderLayout());
        
        // Create buttons for each region
        JButton btnNorth = new JButton("North");
        JButton btnEast = new JButton("East");
        JButton btnSouth = new JButton("South");
        JButton btnWest = new JButton("West");
        JButton btnCenter = new JButton("Center");

        // Add buttons to specific positions in the BorderLayout
        add(btnNorth, BorderLayout.NORTH);   // North region
        add(btnEast, BorderLayout.EAST);     // East region
        add(btnSouth, BorderLayout.SOUTH);   // South region
        add(btnWest, BorderLayout.WEST);     // West region
        add(btnCenter, BorderLayout.CENTER); // Center region

        // Set frame properties
        setTitle("BorderLayout Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new five();
    }
}
