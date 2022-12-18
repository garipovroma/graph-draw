package am.garipov.lab05;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomGraphGenerator {
    Random rand = new Random(42);

    public static class JavaHasNoPair {
        int x;
        int y;
        JavaHasNoPair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static class Graph {
        int n;
        List<List<Integer>> adj;

        public Graph(int n) {
            this.n = n;
            adj = IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).collect(Collectors.toList());
        }

        JavaHasNoPair nodeCoords(int cX, int cY, int num, int radius) {
            int dx = (int) (cX + Math.cos(2 * Math.PI / (double) n * (double) num) * radius);
            int dy = (int) (cY + Math.sin(2 * Math.PI / (double) n * (double) num) * radius);
            return new JavaHasNoPair(dx, dy);
        }
    }


    Graph generateGraph() {
        int n = rand.nextInt(100);
        Graph result = new Graph(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rand.nextBoolean()) {
                    result.adj.get(i).add(j);
                    result.adj.get(j).add(i);
                }
            }
        }
        return result;
    }
}
