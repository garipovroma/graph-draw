package am.garipov.lab05;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (Objects.equals(args[0], "javafx")) {
            Graph graph = new JavaFXGraphImpl();
            graph.drawGraph();
        } else if (Objects.equals(args[0], "awt")) {
            Graph graph = new AwtGraphImpl();
            graph.drawGraph();
        }
    }
}
