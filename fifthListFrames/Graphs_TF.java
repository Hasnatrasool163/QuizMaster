package fifthListFrames;

import frame.True_False_Questions;

public class Graphs_TF extends True_False_Questions {

    public Graphs_TF(String name) {
        super(name);
    }
//  49
    @Override
    public final void loadQuestions() {
        questions.add("A tree is a connected graph with no cycles.");
        answers.add("True");

        questions.add("In a graph, the shortest path between two nodes is always unique.");
        answers.add("False");

        questions.add("A spanning tree of a graph contains all the vertices of the graph.");
        answers.add("True");

        questions.add("A complete binary tree with n nodes has exactly n-1 edges.");
        answers.add("True");

        questions.add("In a binary search tree, the left subtree of a node contains only nodes with keys greater than the node's key.");
        answers.add("False");

        questions.add("Depth-first search (DFS) uses a queue data structure.");
        answers.add("False");

        questions.add("Breadth-first search (BFS) can be used to find the shortest path in an unweighted graph.");
        answers.add("True");

        questions.add("A graph with n vertices and n-1 edges is always a tree.");
        answers.add("False");

        questions.add("In a directed acyclic graph (DAG), there is always a topological ordering of vertices.");
        answers.add("True");

        questions.add("A minimum spanning tree of a graph is unique.");
        answers.add("False");

        questions.add("The height of a tree is the number of edges on the longest path from the root to a leaf.");
        answers.add("True");

        questions.add("In an adjacency matrix representation of a graph, the space complexity is O(V^2), where V is the number of vertices.");
        answers.add("True");

        questions.add("A binary tree with n leaves has at least log2(n) levels.");
        answers.add("False");

        questions.add("Kruskal's algorithm for finding a minimum spanning tree uses a greedy approach.");
        answers.add("True");

        questions.add("The in-degree of a vertex in a directed graph is the number of edges coming into the vertex.");
        answers.add("True");

        questions.add("A binary heap is a complete binary tree.");
        answers.add("True");

        questions.add("In a weighted graph, all minimum spanning trees have the same total weight.");
        answers.add("True");

        questions.add("Prim's algorithm for finding a minimum spanning tree can be implemented using a priority queue.");
        answers.add("True");

        questions.add("In a binary search tree, the in-order traversal of the tree gives the keys in sorted order.");
        answers.add("True");

        questions.add("A balanced binary tree is a tree where the height difference between the left and right subtrees of any node is at most 2.");
        answers.add("False");

        questions.add("A self-loop in a graph is an edge that connects a vertex to itself.");
        answers.add("True");

        questions.add("An Eulerian path in a graph visits every edge exactly once.");
        answers.add("True");

        questions.add("The adjacency list representation of a graph is more space-efficient than the adjacency matrix for sparse graphs.");
        answers.add("True");

        questions.add("In a directed graph, a strongly connected component is a subgraph where there is a path between any pair of vertices.");
        answers.add("True");

        questions.add("A binary tree can have at most two children per node.");
        answers.add("True");

        questions.add("The degree of a vertex in an undirected graph is the number of edges connected to it.");
        answers.add("True");

        questions.add("In a weighted graph, the shortest path between two vertices always passes through the vertex with the smallest weight.");
        answers.add("False");

        questions.add("A red-black tree is a self-balancing binary search tree.");
        answers.add("True");

        questions.add("A bipartite graph can be divided into two disjoint sets such that no two graph vertices within the same set are adjacent.");
        answers.add("True");

        questions.add("A full binary tree is a tree in which every node other than the leaves has exactly two children.");
        answers.add("True");

        questions.add("The post-order traversal of a binary tree visits the root node before its children.");
        answers.add("False");

        questions.add("In an AVL tree, the heights of the two child subtrees of any node differ by at most 2.");
        answers.add("False");

        questions.add("A Hamiltonian cycle in a graph is a cycle that visits every vertex exactly once.");
        answers.add("True");

        questions.add("A directed graph can have at most one strongly connected component.");
        answers.add("False");

        questions.add("The edge connectivity of a graph is the minimum number of edges that need to be removed to disconnect the graph.");
        answers.add("True");

        questions.add("In a max-heap, the root node contains the smallest value in the heap.");
        answers.add("False");

        questions.add("A complete graph is a graph in which there is a unique path between any two vertices.");
        answers.add("False");

        questions.add("A k-ary tree is a tree where each node has at most k children.");
        answers.add("True");

        questions.add("The time complexity of DFS and BFS is O(V + E), where V is the number of vertices and E is the number of edges.");
        answers.add("True");

        questions.add("A planar graph can be drawn on a plane without any edges crossing.");
        answers.add("True");

        questions.add("A cycle graph is a graph that forms a single cycle.");
        answers.add("True");

        questions.add("The root node of a binary search tree is always the smallest element in the tree.");
        answers.add("False");

        questions.add("The adjacency matrix of a graph is symmetric if the graph is undirected.");
        answers.add("True");

        questions.add("In a graph, two vertices are adjacent if they are connected by a direct edge.");
        answers.add("True");

        questions.add("The Bellman-Ford algorithm can handle graphs with negative weight edges.");
        answers.add("True");

        questions.add("An articulation point in a graph is a vertex whose removal increases the number of connected components.");
        answers.add("True");

        questions.add("A spanning tree of a graph is always a subgraph of the original graph.");
        answers.add("True");

        questions.add("A directed graph is strongly connected if there is a directed path between every pair of vertices.");
        answers.add("True");

        questions.add("The preorder traversal of a binary tree visits the root node after its children.");
        answers.add("False");

    }

    public static void main(String[] args) {
        new Graphs_TF(name).setVisible(true);
    }

}
