package am.garipov.lab05;

public interface DrawingApi {
    long getDrawingAreaWidth();
    long getDrawingAreaHeight();
    void drawCircle(int x, int y, int r);
    void drawLine(int x0, int y0, int x1, int y1);
}
