import java.awt.*;
import java.awt.event.*;

public class seven extends Frame {

    seven() {
        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a menu
        Menu colorMenu = new Menu("Colors");

        // Create menu items
        MenuItem red = new MenuItem("Red");
        MenuItem green = new MenuItem("Green");
        MenuItem blue = new MenuItem("Blue");
        MenuItem black = new MenuItem("Black");

        // Disable the "Black" menu item
        black.setEnabled(false);

        // Add menu items to the menu
        colorMenu.add(red);
        colorMenu.add(green);
        colorMenu.add(blue);
        colorMenu.add(black);

        // Add the menu to the menu bar
        menuBar.add(colorMenu);

        // Set the menu bar to the frame
        setMenuBar(menuBar);

        // Add action listeners to menu items
        red.addActionListener(e -> setBackground(Color.RED));
        green.addActionListener(e -> setBackground(Color.GREEN));
        blue.addActionListener(e -> setBackground(Color.BLUE));

        // Frame settings
        setSize(400, 400);
        setTitle("Color Menu Example");
        setLayout(new FlowLayout());
        setVisible(true);

        // Add window close functionality
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new seven();
    }
}
