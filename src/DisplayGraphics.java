import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {

    public DisplayGraphics() {
        setBounds(0, 0, 400, 400);
        setVisible(true);
        setLayout(null);

    }

    protected void paintComponent(Graphics g) {
        // Let UI delegate paint first
        // (including background filling, if I'm opaque)
        super.paintComponent(g);
        //super.paint(g);
        super.setBackground(Color.BLACK);
        // paint my contents next....         }\
        g.setColor(Color.white);
        g.drawLine(1, 1,Main.world.painter.returnLinePoint().x, Main.world.painter.returnLinePoint().y);
    }

}
