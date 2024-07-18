package fourthListFrames;

import frame.True_False_Questions;

public class DataStructures_TF extends True_False_Questions {

    public DataStructures_TF(String name) {
        super(name);
        loadQuestions();
    }
   
// dsa 69
    @Override
    public final void loadQuestions() {

        
        questions.add("A stack follows the Last In First Out (LIFO) principle.");
        answers.add("True");

        questions.add("A queue follows the First In First Out (FIFO) principle.");
        answers.add("True");

        questions.add("The time complexity of accessing an element in an array is O(1).");
        answers.add("True");

        questions.add("The time complexity of inserting an element at the beginning of a linked list is O(1).");
        answers.add("True");

        questions.add("In a binary search tree, the left child of a node contains values greater than the node.");
        answers.add("False");

        questions.add("A binary tree is a tree in which each node has at most two children.");
        answers.add("True");

        questions.add("In a min-heap, the parent node is always smaller than its child nodes.");
        answers.add("True");

        questions.add("The height of a balanced binary tree is O(log n).");
        answers.add("True");

        questions.add("A hash table provides average case O(1) time complexity for search operations.");
        answers.add("True");

        questions.add("In a depth-first search (DFS), the algorithm explores as far down a branch as possible before backtracking.");
        answers.add("True");

        questions.add("In a breadth-first search (BFS), the algorithm explores all the neighbors of a node before moving on to the next level.");
        answers.add("True");

        questions.add("A graph can be represented using an adjacency matrix or an adjacency list.");
        answers.add("True");

        questions.add("Dijkstra's algorithm is used to find the shortest path in an unweighted graph.");
        answers.add("False");

        questions.add("Kruskal's algorithm is used to find the minimum spanning tree of a graph.");
        answers.add("True");

        questions.add("A stack can be implemented using an array or a linked list.");
        answers.add("True");

        questions.add("A queue can be implemented using an array or a linked list.");
        answers.add("True");

        questions.add("In an undirected graph, the edges have no direction.");
        answers.add("True");

        questions.add("A directed graph is also known as a digraph.");
        answers.add("True");

        questions.add("The time complexity of quicksort in the average case is O(n log n).");
        answers.add("True");

        questions.add("The time complexity of mergesort in the worst case is O(n log n).");
        answers.add("True");

        questions.add("The time complexity of bubble sort in the worst case is O(n^2).");
        answers.add("True");

        questions.add("In a binary search tree, an inorder traversal visits the nodes in sorted order.");
        answers.add("True");

        questions.add("In a priority queue, elements are dequeued in ascending order of priority.");
        answers.add("False");

        questions.add("A red-black tree is a type of self-balancing binary search tree.");
        answers.add("True");

        questions.add("The time complexity of inserting an element in a red-black tree is O(log n).");
        answers.add("True");

        questions.add("A B-tree is used to organize large amounts of data in databases and file systems.");
        answers.add("True");

        questions.add("The height of an AVL tree is O(log n).");
        answers.add("True");

        questions.add("A graph with no cycles is called a tree.");
        answers.add("True");

        questions.add("A connected graph has a path between every pair of vertices.");
        answers.add("True");

        questions.add("A spanning tree of a graph contains all the vertices and is a subgraph that is a tree.");
        answers.add("True");

        questions.add("The time complexity of deleting an element from a hash table is O(1) in the average case.");
        answers.add("True");

        questions.add("The maximum number of nodes in a binary tree of height h is 2^h - 1.");
        answers.add("True");

        questions.add("In a max-heap, the parent node is always larger than its child nodes.");
        answers.add("True");

        questions.add("The time complexity of building a heap from an array of n elements is O(n log n).");
        answers.add("False");

        questions.add("The Floyd-Warshall algorithm is used to find the shortest paths between all pairs of vertices in a graph.");
        answers.add("True");

        questions.add("A greedy algorithm always produces the optimal solution.");
        answers.add("False");

        questions.add("Dynamic programming is used to solve problems by breaking them down into simpler subproblems.");
        answers.add("True");

        questions.add("The time complexity of matrix chain multiplication using dynamic programming is O(n^3).");
        answers.add("True");

        questions.add("A trie is a type of search tree used for storing associative data structures.");
        answers.add("True");

        questions.add("The Bellman-Ford algorithm can handle graphs with negative weight edges.");
        answers.add("True");

        questions.add("The time complexity of inserting an element in a B-tree is O(log n).");
        answers.add("True");

        questions.add("A skip list is a data structure that allows fast search, insertion, and deletion operations.");
        answers.add("True");

        questions.add("In a skip list, the average time complexity for search operations is O(log n).");
        answers.add("True");

        questions.add("The time complexity of finding the maximum element in a min-heap is O(log n).");
        answers.add("False");

        questions.add("In a disjoint set data structure, the union operation merges two disjoint sets into a single set.");
        answers.add("True");

        questions.add("Tarjan's algorithm is used to find strongly connected components in a graph.");
        answers.add("True");

        questions.add("In a binary search tree, the time complexity of finding the minimum element is O(log n).");
        answers.add("True");

        questions.add("The Boyer-Moore algorithm is used for string matching.");
        answers.add("True");

        questions.add("The KMP (Knuth-Morris-Pratt) algorithm is used to search for a substring in a text.");
        answers.add("True");

        questions.add("The time complexity of the KMP algorithm is O(m+n), where m is the length of the pattern and n is the length of the text.");
        answers.add("True");

        questions.add("A bloom filter is a probabilistic data structure used to test whether an element is a member of a set.");
        answers.add("True");

        questions.add("A bloom filter can return false positives but not false negatives.");
        answers.add("True");

        questions.add("The time complexity of the Floyd-Warshall algorithm is O(n^3).");
        answers.add("True");

        questions.add("The time complexity of Prim's algorithm for finding the minimum spanning tree is O(V^2) for an adjacency matrix representation.");
        answers.add("True");

        questions.add("The Edmonds-Karp algorithm is used to find the maximum flow in a flow network.");
        answers.add("True");

        questions.add("A circular linked list is a type of linked list in which the last node points to the first node.");
        answers.add("True");

        questions.add("In an adjacency list representation of a graph, each vertex has a list of adjacent vertices.");
        answers.add("True");

        questions.add("The height of a complete binary tree is O(log n).");
        answers.add("True");

        questions.add("The Rabin-Karp algorithm uses hashing to find a pattern in a text.");
        answers.add("True");

        questions.add("The Rabin-Karp algorithm has a worst-case time complexity of O(nm), where n is the length of the text and m is the length of the pattern.");
        answers.add("True");

        questions.add("A perfect binary tree is a binary tree in which all interior nodes have exactly two children and all leaves have the same depth.");
        answers.add("True");

        questions.add("A directed acyclic graph (DAG) contains at least one cycle.");
        answers.add("False");

        questions.add("The time complexity of finding the shortest path in a weighted graph using Dijkstra's algorithm is O(V^2) for an adjacency matrix representation.");
        answers.add("True");

        questions.add("A self-balancing binary search tree guarantees O(1) time complexity for search operations.");
        answers.add("False");

        questions.add("An adjacency matrix representation of a graph requires O(V^2) space, where V is the number of vertices.");
        answers.add("True");

        questions.add("The time complexity of heap sort is O(n log n) in the worst case.");
        answers.add("True");

        questions.add("The Kruskal's algorithm uses the union-find data structure.");
        answers.add("True");

        questions.add("The Gale-Shapley algorithm is used to solve the stable matching problem.");
        answers.add("True");

        questions.add("A deques is a double-ended queue that allows insertion and deletion at both ends.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new DataStructures_TF(name).setVisible(true);
    }

}
