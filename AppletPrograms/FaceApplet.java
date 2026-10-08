import java.applet.Applet;
import java.awt.Graphics;

public class FaceApplet extends Applet {

    public void paint(Graphics g) {

        // Face
        g.drawOval(80, 40, 200, 200);

        // Eyes
        g.fillOval(125, 90, 20, 20);
        g.fillOval(215, 90, 20, 20);

        // Nose
        g.drawLine(180, 110, 170, 160);
        g.drawLine(170, 160, 190, 160);

        // Mouth
        g.drawArc(140, 150, 80, 50, 180, 180);
    }
}