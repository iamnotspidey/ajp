// Develop a Program to display the key pressed, key typed and key released event on Applet Window.
package Question14;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Widget{
    Widget(){
        JFrame frame = new JFrame("Key Events");

        JLabel keyJLabel = new JLabel("No Key Pressed");

        frame.addKeyListener(new KeyListener() { // sara method implement karna h warna error dega

            public void keyTyped(KeyEvent e) {
                
               
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ALT) {
                    keyJLabel.setText("Key Pressed: Alt");
                } else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
                    keyJLabel.setText("Key Pressed: SHIFT");
                } else {
                    keyJLabel.setText("Key Pressed: " + e.getKeyChar());
                }
            }

            public void keyReleased(KeyEvent e) {
                keyJLabel.setText("Key Released");
            }
            
        });

        frame.add(keyJLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setSize(500,500);
    }
}

public class q14 {
    public static void main(String[] args) {
        new Widget();
    }
}
