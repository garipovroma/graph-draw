package am.garipov.lab05;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtGraphImpl extends Graph {
    public static class AwtDrawer extends Frame {
        @Override
        public void paint(Graphics g) {
            drawingApi = new AwtDrawingApiImpl(this, g);
            draw();
        }

        public static void run() {
            Frame frame = new AwtDrawer();
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
            frame.setSize(700, 700);
            frame.setVisible(true);
        }
    }

    @Override
    public void drawGraph() {
        AwtDrawer.run();
    }
}
