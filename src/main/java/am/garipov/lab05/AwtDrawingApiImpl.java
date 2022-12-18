package am.garipov.lab05;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AwtDrawingApiImpl implements DrawingApi {
    protected Frame frame;
    protected Graphics g;
    protected Graphics2D ga;

    public AwtDrawingApiImpl(Frame frame, Graphics g) {
        this.frame = frame;
        this.g = g;
        ga = (Graphics2D) g;
    }

    @Override
    public long getDrawingAreaWidth() {
        return frame.getWidth();
    }

    @Override
    public long getDrawingAreaHeight() {
        return frame.getHeight();
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        ga.fill(new Ellipse2D.Float(x, y, 2 * r, 2 * r));
    }

    @Override
    public void drawLine(int x0, int y0, int x1, int y1) {
        ga.drawLine(x0, y0, x1, y1);
    }
}
