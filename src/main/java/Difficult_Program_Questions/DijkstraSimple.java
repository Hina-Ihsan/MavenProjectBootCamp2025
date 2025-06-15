package Difficult_Program_Questions;
public class DijkstraSimple {

    // Number of vertices
    static final int V = 5;

    // Function to find the vertex with the minimum distance
    static int findMinVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < V; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Dijkstra's algorithm using adjacency matrix
    static void dijkstra(int[][] graph, int source) {
        int[] distance = new int[V];     // Distance from source to vertex
        boolean[] visited = new boolean[V]; // To mark visited vertices

        // Initialize distances to infinity
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[source] = 0; // Distance to source is 0

        // Process all vertices
        for (int i = 0; i < V - 1; i++) {
            int u = findMinVertex(distance, visited);
            visited[u] = true;

            // Update distances of adjacent vertices
            for (int v = 0; v < V; v++) {
                // Check if there's an edge and vertex is not visited
                if (!visited[v] && graph[u][v] != 0 &&
                    distance[u] != Integer.MAX_VALUE &&
                    distance[u] + graph[u][v] < distance[v]) {

                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        // Print shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To vertex " + i + " = " + distance[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Adjacency matrix for the graph
        int[][] graph = {
            {0, 2, 4, 0, 0},
            {0, 0, 1, 7, 0},
            {0, 0, 0, 0, 3},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };

        // Run Dijkstra from source vertex 0
        dijkstra(graph, 0);
    }
}