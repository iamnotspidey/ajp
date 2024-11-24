// Develop a program using AWT to create a menubar in an applet window.

import java.awt.*;
import java.awt.event.*;

class Widget {
    Widget() {
        Frame frame = new Frame("Menu Bar Practical");

        Menu filMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        Menu HomeMenu = new Menu("Home");

        MenuItem OpenFolder = new MenuItem("Open Folder");
        MenuItem insertImage = new MenuItem("Insert Image");

        HomeMenu.add(OpenFolder);
        HomeMenu.add(insertImage);


        filMenu.add(openItem);
        filMenu.add(saveItem);
        filMenu.addSeparator(); // Add Line jo Exit k updar h Bold me 
        filMenu.add(exitItem);


        exitItem.addActionListener(e -> frame.dispose()); // Simple h Islye likha h !! event me ye hi karo warna niche wala karo

        // exitItem.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         frame.dispose();
        //     }
        // });


        MenuBar menuBar = new MenuBar();
        menuBar.add(filMenu);
        menuBar.add(HomeMenu);
        frame.setMenuBar(menuBar);


        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

class Menubar {
    public static void main(String[] args) {
        new Widget();
    }
}
