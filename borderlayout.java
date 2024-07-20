 import javax.swing.*;
import java.awt.*;

public class borderlayout extends JFrame {
    public borderlayout() {
        super("BorderLayout Demo");

        // Create components
        JButton btnNorth = new JButton("TOP");
        JButton btnSouth = new JButton("DOWN");
        JButton btnEast = new JButton("RIGHT");
        JButton btnWest = new JButton("LEFT");
        JButton btnCenter = new JButton("CENTER");

        // Set layout
        setLayout(new BorderLayout());

        // Add components to the frame with specified layout positions
        add(btnNorth, BorderLayout.NORTH);
        add(btnSouth, BorderLayout.SOUTH);
        add(btnEast, BorderLayout.EAST);
        add(btnWest, BorderLayout.WEST);
        add(btnCenter, BorderLayout.CENTER);

        // Set frame properties
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  borderlayout();
    }
}

