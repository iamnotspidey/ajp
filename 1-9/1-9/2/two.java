import java.awt.*;
class two extends Frame{
    two(){
        Label l1 =new Label("LANGUAGES : ");
        Label l2 = new Label("GENDER : ");
        Checkbox chk1 = new Checkbox("Marathi");
        Checkbox chk2 = new Checkbox("English");
        Checkbox chk3 = new Checkbox("Hindi");
        Checkbox chk4 = new Checkbox("  Sanskrit");
        CheckboxGroup grp=new CheckboxGroup();
        Checkbox chk5=new Checkbox("Male",grp,false);
        Checkbox chk6 =new Checkbox("Female",grp,false);
        add(l1);
        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);
        add(l2);
        add(chk5);
        add(chk6);

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);

    }
    public static void main(String[] args) {
        new two();
    }
}
