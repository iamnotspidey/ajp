package Question5;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Widget {
    Widget(){
        JFrame frame = new JFrame();
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        JLabel North = new JLabel("North",JLabel.CENTER);
        JLabel South = new JLabel("South",JLabel.CENTER);
        JLabel East = new JLabel("East",JLabel.CENTER);
        JLabel West  = new JLabel("West",JLabel.CENTER);
        JLabel Center = new JLabel("Center",JLabel.CENTER);
       
        frame.add(North,borderLayout.NORTH);
        frame.add(South,borderLayout.SOUTH);
        frame.add(East,borderLayout.EAST);
        frame.add(West,borderLayout.WEST);
        frame.add(Center,borderLayout.CENTER);


        frame.setVisible(true);
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class q5 {
    public static void main(String[] args) {
        new Widget();
    }
}
