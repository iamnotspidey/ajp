import java.awt.*;
public class eight extends Frame{

    eight(){
        TextField num1=new TextField(10);
        TextField num2=new TextField(10);
        Button ans = new Button("ADD + ");
        add(num1);
        add(num2);
        add(ans);
        ans.addActionListener(e -> {
            try {
                // Parse input and calculate result
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                int result = n1 + n2;

                // Show result in a dialog
                Dialog d = new Dialog(this, "Answer", true);
                d.setLayout(new FlowLayout());
                d.setSize(200, 100);
                d.add(new Label("Answer is: " + result));
                Button ok = new Button("OK");
                d.add(ok);
                ok.addActionListener(e1 -> d.setVisible(false));
                d.setVisible(true);
            } catch (NumberFormatException ex) {
                // Show error message for invalid input
                Dialog d = new Dialog(this, "Error", true);
                d.setLayout(new FlowLayout());
                d.setSize(200, 100);
                d.add(new Label("Invalid input! Enter numbers."));
                Button ok = new Button("OK");
                d.add(ok);
                ok.addActionListener(e1 -> d.setVisible(false));
                d.setVisible(true);
            }
        });
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);

    }
    public static void main(String[] args) {
        new eight();
    }
}