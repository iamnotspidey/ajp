// Write a program using JPasswordField and JTextField to demonstrate the use of user authentication.

package Question16;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Widget{
    Widget(){
        JFrame frame = new JFrame("Login");
        JTextField userName = new JTextField();
        JPasswordField password = new JPasswordField();
        JButton Auth = new JButton("Authenticate");
        JLabel msg = new JLabel();

        userName.setPreferredSize(new Dimension(100,25));
        password.setPreferredSize(new Dimension(100,25));

        frame.add(userName);
        frame.add(password);
        frame.add(Auth);
        frame.add(msg);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(500,500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Auth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String username = userName.getText();
                char[] pass = password.getPassword(); // Return array of char
                String passCode = new String(pass);

                if(passCode.equals("1234") && username.equals("User123")){
                    msg.setText("Welcome User");
                }else{
                    msg.setText("Auth Fail");
                }
            }
        });

    }
}
public class q16 {
    public static void main(String[] args) {
        new Widget();
    }
}
