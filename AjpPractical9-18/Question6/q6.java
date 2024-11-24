package Question6;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Widget{
    Widget(){
        JFrame frame = new JFrame();
        GridLayout gridLayout = new GridLayout(3,3);
        frame.setLayout(gridLayout);
       
        
        for(int i = 0; i <= 10;i++){
            frame.add(new JButton("Button : " + (i+1)));
        }

        frame.setVisible(true);
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class q6 {
    public static void main(String[] args) {
        new Widget();
    }
    
}
