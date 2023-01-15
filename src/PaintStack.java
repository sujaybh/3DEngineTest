import java.awt.*;

public class PaintStack {

    public Point linePoint;

    public PaintStack() {
        linePoint = new Point();
    }

    public void changeLinePoint(int dx, int dy) {
        linePoint.x += dx;
        linePoint.y += dy;
    }

    public Point returnLinePoint() {
        return new Point (linePoint);
    }
}
