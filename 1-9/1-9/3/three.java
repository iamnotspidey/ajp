import java.awt.*;
import java.awt.event.ActionListener;
public class three extends Frame{
    three(){
        Label l = new Label("SELEC YOU FAVOURITE NEWS PAPER: ");
        add(l);
        List news= new List(5,true);
        news.add("The Times of India");
        news.add("The Hindu");
        news.add("Indian Express");
        news.add("Deccan Chronicle");
        news.add("Hindustan Times");
        news.add("The Economic Times");
        add(news);
        Button b=new Button("submit");
        add(b);
        b.addActionListener(e ->{
            Dialog d = new Dialog(this, "Submitted", true);
            d.setLayout(new FlowLayout());
            d.setSize(200, 100);

            Label l1 = new Label("Newspaper selected successfully!");
            d.add(l1);

            // OK button to close the dialog
            Button ok = new Button("OK");
            d.add(ok);
            ok.addActionListener(e1 -> d.setVisible(false));

            d.setVisible(true);

        });
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
    }
    
    
    public static void main(String[] args) {
        new three();
    }   
}
