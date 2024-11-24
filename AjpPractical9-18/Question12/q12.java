//Write a Jtree program to show root directory and its subFolders of your System.

package Question12;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

class Widget {
    Widget() {
        JFrame frame = new JFrame("Tree");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:/");
        DefaultMutableTreeNode user = new DefaultMutableTreeNode("User");
        DefaultMutableTreeNode userName = new DefaultMutableTreeNode("Abhinav");
        DefaultMutableTreeNode ProgramFiles = new DefaultMutableTreeNode("Program File");


        root.add(user);
        root.add(ProgramFiles);
        user.add(userName);

        JTree tree = new JTree(root); // Ye add hoga frame me islye root ko tree me add karna compulsory h 

        frame.add(tree);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent e) {
        //         frame.dispose();
        //     }
        // });
    }
}

public class q12 {
    public static void main(String[] args) {
        new Widget();
    }
}
