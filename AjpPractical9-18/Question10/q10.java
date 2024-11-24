// Write a program using swing to display a JcomboBox in an applet

package Question10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Widget extends JApplet {
    public void init() {

        setLayout(new FlowLayout()); // warna full screen lega Flow me top center me
        JLabel label = new JLabel("Select an Option:");

        String[] options = { "Option 1", "Option 2", "Option 3", "Option 4" };
        JComboBox<String> comboBox = new JComboBox<>(options);
        JLabel selectOptions = new JLabel("Nothing Selected");


        add(label);
        add(comboBox);
        add(selectOptions);


        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String option = (String) comboBox.getSelectedItem(); // Return Objecct so type cast into string 
                selectOptions.setText("You Selected: "+ option);
            }
        });
    }
}

public class q10 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JComboBox in Applet");
        Widget widget = new Widget();

        widget.init(); // JApplet ko extent karna warna error dega
        widget.start();

        frame.add(widget);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
