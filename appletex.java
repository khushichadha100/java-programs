import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;

public class MouseEventsApplet extends Applet implements MouseListener, MouseMotionListener {
    private String message = "Move the mouse or click.";

    public void init() {
        addMouseListener(this); // Registering mouse listener
        addMouseMotionListener(this); // Registering mouse motion listener
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        message = "Mouse clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        message = "Mouse moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

     
}
