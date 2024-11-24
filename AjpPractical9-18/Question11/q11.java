/** Create a simple stopwatch application using JLabel to display time in seconds, and JButton for start, stop, and reset. Use a Timer to update the time every second and allow the user to start, stop, and reset the stopwatch with the corresponding buttons. */

package Question11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Widget {
    int seconds = 0;
    Timer timer;

    Widget() {
        JFrame frame = new JFrame("Stop Watch");

        JLabel time = new JLabel("00:00:00");

        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton restart = new JButton("Restart");

        timer = new Timer(1000, e -> {
            seconds++;
            time.setText(formatTime(seconds));
        });

        start.addActionListener(e -> timer.start());

        stop.addActionListener(e -> timer.stop());

        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                seconds = 0;
                time.setText("00:00:00");
                timer.start();
            }
        });

        frame.add(time);
        frame.add(start);
        frame.add(stop);
        frame.add(restart);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 150); 
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ye One Line Close h swing me close karne ka (Only For JFrame) warna yniche waa likho

        // frame.addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent e){
        //         frame.dispose();
        //     }
        // });
    }


    // ye wala function yaad karlo ye gpt wala h 
    String formatTime(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class q11 {
    public static void main(String[] args) {
        new Widget();
    }
}
