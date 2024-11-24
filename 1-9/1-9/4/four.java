import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="four" width=400 height=300>
</applet>
*/

public class four extends Applet {
    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Label for instruction
        Label label = new Label("Select cities from the list:");
        add(label);

        // List component with multiple selection enabled
        List cityList = new List(10, true);
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Tokyo");
        cityList.add("Mumbai");
        cityList.add("Sydney");
        cityList.add("Dubai");
        cityList.add("Paris");
        cityList.add("Berlin");
        cityList.add("Moscow");
        cityList.add("Singapore");
        add(cityList);

        // Button to show the selected cities
        Button showSelectionButton = new Button("Show Selected Cities");
        add(showSelectionButton);

        // TextArea to display selected cities
        TextArea selectedCities = new TextArea(5, 30);
        selectedCities.setEditable(false);
        add(selectedCities);

        // Add action listener to the button
        showSelectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String[] selected = cityList.getSelectedItems();
            String result = "Selected Cities:\n";
            for (String city : selected) {
                result += city + "\n";
            }
            selectedCities.setText(result);

            }
        });
    }
}
