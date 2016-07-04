import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawComponent extends JComponent {

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 400;

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(new Color(128,128,128));

        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rect);
        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rect);
        g2.fill(ellipse2D);

        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(rect.getCenterX(), rect.getCenterY(),
                rect.getCenterX() + radius, rect.getCenterY() + radius);

        g2.draw(circle);

        Font sansbold14 = new Font("SansSerif", Font.BOLD,14);
        g2.setFont(sansbold14);
        g2.drawString("Hello, World",150,80);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

}
