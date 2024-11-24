import java.awt.*;
import java.awt.event.ActionListener;
class one extends Frame{
    one(){
        TextField tf=new TextField(20);
        TextArea ta=new TextArea(10,20);
        Button b=new Button("button");
        Label l=new Label("3rd year topper is mohit rohra");
        add(tf);
        add(ta);
        add(b);
        add(l);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
    }

    public static void main(String []args){
        new one();
    }
}