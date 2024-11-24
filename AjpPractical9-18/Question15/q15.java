//.Develop a program to accept two numbers and display product of two numbers when user presses “Multiply” button.

package Question15;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Widget {
    Widget() {
        JFrame frame = new JFrame();
        JTextField tb1 = new JTextField(null);
        JTextField tb2 = new JTextField();
        JButton btn = new JButton("Calculate");
        JLabel Ans = new JLabel();

        tb1.setPreferredSize(new Dimension(100,20));
        tb2.setPreferredSize(new Dimension(100,20));

        frame.add(tb1);
        frame.add(tb2);
        frame.add(btn);
        frame.add(Ans);

        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(100, 100);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try{
                double num1 = Double.parseDouble(tb1.getText());
                double num2 = Double.parseDouble(tb2.getText());
                

                double Answer = num1 * num2;

                Ans.setText("Mutiplication of " + num1 + " X " + num2 + " : " + Answer);
                }catch(Exception ex){
                    Ans.setText("Invalid Number");
                }
            }
        });
    }
}

public class q15 {
    public static void main(String[] args) {
        new Widget();
    }
}
