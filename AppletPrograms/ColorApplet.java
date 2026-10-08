import java.applet.Applet;
import java.awt.*;

public class ColorApplet extends Applet {

    public void paint(Graphics g) {

        // Red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 80);

        // Blue oval
        g.setColor(Color.BLUE);
        g.fillOval(250, 50, 120, 80);

        // Bold message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 80, 180);
    }
}