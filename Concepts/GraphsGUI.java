package Concepts;

import javax.swing.SwingUtilities;

public class GraphsGUI extends AbstractConceptsGUI {

    public GraphsGUI() {
        super("Graphs in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Graphs in Java represent a set of vertices and edges connecting pairs of vertices.
               
               Key Concepts:
               1. Graph Representation: Adjacency Matrix, Adjacency List
               2. Depth-First Search (DFS)
               3. Breadth-First Search (BFS)
               4. Shortest Path Algorithms: Dijkstra's Algorithm
               
               Example of Adjacency List Representation:
               class Graph {
                   int V;
                   LinkedList<Integer>[] adj;

                   Graph(int V) {
                       this.V = V;
                       adj = new LinkedList[V];
                       for (int i = 0; i < V; ++i)
                           adj[i] = new LinkedList<>();
                   }
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               import java.util.LinkedList;

               public class Main {
                   // Example of Depth-First Search (DFS)
                   static void DFSUtil(int v, boolean[] visited, Graph graph) {
                       visited[v] = true;
                       System.out.print(v + " ");

                       for (int n : graph.adj[v]) {
                           if (!visited[n])
                               DFSUtil(n, visited, graph);
                       }
                   }

                   public static void main(String[] args) {
                       Graph graph = new Graph(4);
                       graph.addEdge(0, 1);
                       graph.addEdge(0, 2);
                       graph.addEdge(1, 2);
                       graph.addEdge(2, 0);
                       graph.addEdge(2, 3);
                       graph.addEdge(3, 3);

                       boolean[] visited = new boolean[4];
                       DFSUtil(2, visited, graph); // Starting DFS from node 2
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Graphs in Java are a collection of nodes connected by edges.", true);
        addQuizQuestion("An adjacency matrix is more space-efficient than an adjacency list for sparse graphs.", false);
        addQuizQuestion("Depth-First Search (DFS) always finds the shortest path between two nodes.", false);
        addQuizQuestion("Breadth-First Search (BFS) can be implemented using a queue.", true);
        addQuizQuestion("Dijkstra's Algorithm is used to find the shortest path in a weighted graph.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GraphsGUI frame = new GraphsGUI();
            frame.setVisible(true);
        });
    }
}
