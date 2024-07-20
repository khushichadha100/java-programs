import java.awt.*;
import java.awt.event.*;

public class  eventhandling extends Frame {
    private TextField textField;

    public  eventhandling() {
        setLayout(new FlowLayout());
        textField = new TextField(20);
        Button button = new Button("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button Clicked");
            }
        });
        add(textField);
        add(button);
        setTitle("Event Handling Demo");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  eventhandling();
    }
}
