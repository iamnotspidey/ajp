import java.applet.Applet;
import java.awt.*;

// <applet code="nine" width=400 height=400></applet>
public class nine extends Applet {

    public void init() {
        // Set layout for the applet
        setLayout(new BorderLayout());

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        

        // Create menu items for "File" menu
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        

        // Add menu items to "File" menu
        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.addSeparator(); // Add a separator line
        

        // Create menu items for "Edit" menu
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        // Add menu items to "Edit" menu
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the applet
        setMenuBar(menuBar);

        // Add action listeners for menu items

        // Add a label to the applet to display menu actions
        Label label = new Label("Applet Menu Example", Label.CENTER);
        add(label, BorderLayout.CENTER);

        newFile.addActionListener(e -> label.setText("New File Selected"));
        openFile.addActionListener(e -> label.setText("Open File Selected"));
        cut.addActionListener(e -> label.setText("Cut Selected"));
        copy.addActionListener(e -> label.setText("Copy Selected"));
        paste.addActionListener(e -> label.setText("Paste Selected"));
    }

    // Helper method to set the menu bar in an applet (Applet doesn't natively support MenuBar)
    private void setMenuBar(MenuBar menuBar) {
        Frame frame = (Frame) this.getParent().getParent();
        frame.setMenuBar(menuBar);
    }
}
