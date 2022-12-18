package am.garipov.lab05;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXDrawingApiImpl implements DrawingApi {
    protected Group root;
    protected Canvas canvas;
    protected GraphicsContext gc;
    protected Stage primaryStage;

    public JavaFXDrawingApiImpl(Stage primaryStage, int w, int h) {
        this.root = new Group();
        this.canvas = new Canvas(w, h);
        this.gc = canvas.getGraphicsContext2D();
        this.primaryStage = primaryStage;
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    @Override
    public long getDrawingAreaWidth() {
        return (long) canvas.getWidth();
    }

    @Override
    public long getDrawingAreaHeight() {
        return (long) canvas.getHeight();
    }

    @Override
    public void drawCircle(int x, int y, int r) {
        gc.setFill(Color.INDIANRED);
        gc.fillOval(x, y, r * 2, r * 2);
    }

    @Override
    public void drawLine(int x0, int y0, int x1, int y1) {
        gc.setFill(Color.ROYALBLUE);
        Line line = new Line(x0, y0, x1, y1);
        root.getChildren().add(line);
    }
}
