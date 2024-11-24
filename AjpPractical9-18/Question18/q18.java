package Question18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Widget {
    Widget() {
        JFrame frame = new JFrame("Get IP Address");
        JTextField tb = new JTextField(20);  
        JButton btn = new JButton("Get IP");
        JLabel msg = new JLabel("Enter Hostname and click 'Get IP'");


        frame.setLayout(new FlowLayout());
        frame.add(tb);
        frame.add(btn);
        frame.add(msg);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setVisible(true);


        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    String hostname = tb.getText();

                    InetAddress inet = InetAddress.getByName(hostname);
                    System.out.println(InetAddress.getLocalHost());
                    msg.setText("IP Address: " + inet.getHostAddress());
                } catch (Exception ex) {

                    msg.setText("Invalid hostname. Please try again.");
                }
            }
        });
    }
}

public class q18 {
    public static void main(String[] args) {
        new Widget(); 
    }
}
