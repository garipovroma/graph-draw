package am.garipov.lab05;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXGraphImpl extends Graph {
    public static class JavaFxDrawer extends Application {
        public void run() {
            launch();
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            drawingApi = new JavaFXDrawingApiImpl(primaryStage, 700, 700);
            draw();
        }
    }

    @Override
    public void drawGraph() {
        JavaFxDrawer drawer = new JavaFxDrawer();
        drawer.run();
    }
}
