import java.util.ArrayList;

public class AdjacencyMatrix {

    public static void printAdjacentMatrix(int[][] graph) {
        int vertices = graph.length;

        System.out.println("Adjacenct Matrix: ");
        for (int i = 0; i < vertices; i++) { 
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printAdjacentVertices(int[][] graph) {
        int vertices = graph.length;

        System.out.println("Adjacenct Vertices: ");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " > ");

            ArrayList<Integer> adjacentVertices = new ArrayList<>();

            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1) {
                    adjacentVertices.add(j);
                }
            }
            System.out.println(adjacentVertices);
        }
    }

    public static void main(String args[]) {
        int[][] graph = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {0, 1, 0, 1},
            {1, 0, 0, 0}
        };

        printAdjacentMatrix(graph);
        printAdjacentVertices(graph);
    }
}
