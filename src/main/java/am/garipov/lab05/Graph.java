package am.garipov.lab05;

public abstract class Graph {
    /**
     * Bridge to drawing api
     */
    protected static DrawingApi drawingApi;
    protected static RandomGraphGenerator graphGenerator = new RandomGraphGenerator();

    protected static void draw() {
        RandomGraphGenerator.Graph graph = graphGenerator.generateGraph();
        int cX = (int) (drawingApi.getDrawingAreaWidth() / 2);
        int cY = (int) (drawingApi.getDrawingAreaHeight() / 2);
        int globalRadius = (int) (Math.min(drawingApi.getDrawingAreaWidth(), drawingApi.getDrawingAreaHeight()) / 14 * 6);
        int nodeRadius = (int) Math.sqrt((int) Math.min(drawingApi.getDrawingAreaWidth(), drawingApi.getDrawingAreaHeight()));
        for (int v = 0; v < graph.n; v++) {
            RandomGraphGenerator.JavaHasNoPair coords = graph.nodeCoords(cX, cY, v, globalRadius);
            drawingApi.drawCircle(
                    coords.x - nodeRadius,
                    coords.y - nodeRadius,
                    nodeRadius);
        }
        for (int i = 0; i < graph.n; i++) {
            RandomGraphGenerator.JavaHasNoPair coordsI = graph.nodeCoords(cX, cY, i, globalRadius);
            for (int j = 0; j < graph.adj.get(i).size(); j++) {
                int v = graph.adj.get(i).get(j);
                RandomGraphGenerator.JavaHasNoPair coordsV = graph.nodeCoords(cX, cY, v, globalRadius);
                drawingApi.drawLine(coordsI.x, coordsI.y, coordsV.x, coordsV.y);
            }
        }
    }
    public abstract void drawGraph();
}