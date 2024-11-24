//Write a program to count the number of clicks performed by the user in a frame.

package Question17;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Widget {
    int counter = 0;

    Widget() {
        JFrame frame = new JFrame("Click Counter");
        JLabel label = new JLabel("Clicks: 0", JLabel.CENTER);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                counter++;
                label.setText("Clicks: " + counter);
            }

            public void mousePressed(MouseEvent e) {

            }

            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {

            }
        });
    }
}

public class q17 {
    public static void main(String[] args) {
        new Widget();
    }
}
