package fourthListFrames;

import frame.True_False_Questions;

public class Algorithms_TF extends True_False_Questions {

    public Algorithms_TF(String name) {
        super(name);
    }
// 47
    @Override
    public final void loadQuestions() {

        questions.add("An algorithm is a step-by-step procedure for solving a problem or accomplishing a task.");
        answers.add("True");

        questions.add("All algorithms can be expressed as computer programs.");
        answers.add("True");

        questions.add("Efficiency in algorithms refers to how much time and space an algorithm uses.");
        answers.add("True");

        questions.add("An algorithm with a lower time complexity is always more efficient than one with a higher time complexity.");
        answers.add("True");

        questions.add("Bubble sort is an example of a divide and conquer algorithm.");
        answers.add("False");

        questions.add("Binary search can only be applied to sorted arrays.");
        answers.add("True");

        questions.add("Dynamic programming is a technique used to solve optimization problems.");
        answers.add("True");

        questions.add("Greedy algorithms always provide an optimal solution to a problem.");
        answers.add("False");

        questions.add("Depth-first search (DFS) is typically implemented using a queue data structure.");
        answers.add("False");

        questions.add("Breadth-first search (BFS) is suitable for finding the shortest path in an unweighted graph.");
        answers.add("True");

        questions.add("Quicksort is a stable sorting algorithm.");
        answers.add("False");

        questions.add("Heap sort has a worst-case time complexity of O(n log n).");
        answers.add("True");

        questions.add("Merge sort is an in-place sorting algorithm.");
        answers.add("False");

        questions.add("Dijkstra's algorithm is used to find the shortest path in a weighted graph.");
        answers.add("True");

        questions.add("Prim's algorithm is used to find the minimum spanning tree of a graph.");
        answers.add("True");

        questions.add("Bellman-Ford algorithm is used to find the shortest paths from a source vertex to all other vertices.");
        answers.add("True");

        questions.add("Floyd-Warshall algorithm is used to find the shortest paths between all pairs of vertices.");
        answers.add("True");

        questions.add("The Traveling Salesman Problem (TSP) can be solved efficiently using a greedy algorithm.");
        answers.add("False");

        questions.add("Big-O notation provides an upper bound on the time complexity of an algorithm.");
        answers.add("True");

        questions.add("An algorithm with a time complexity of O(n) will always run faster than one with O(n log n) for large inputs.");
        answers.add("False");

        questions.add("A polynomial-time algorithm is one whose worst-case time complexity is bounded by a polynomial function of the input size.");
        answers.add("True");

        questions.add("The Master Theorem provides a way to analyze the time complexity of divide and conquer algorithms.");
        answers.add("True");

        questions.add("Backtracking is a technique used to find all possible solutions to a problem.");
        answers.add("True");

        questions.add("The Knapsack problem is an example of an optimization problem that can be solved using dynamic programming.");
        answers.add("True");

        questions.add("Breadth-first search (BFS) can be implemented using recursion.");
        answers.add("False");

        questions.add("Depth-first search (DFS) can be used to detect cycles in a graph.");
        answers.add("True");

        questions.add("A greedy algorithm always makes the locally optimal choice at each step.");
        answers.add("True");

        questions.add("Dynamic programming requires problems to have optimal substructure and overlapping subproblems.");
        answers.add("True");

        questions.add("Bubble sort is a stable sorting algorithm.");
        answers.add("True");

        questions.add("Insertion sort is more efficient than quicksort for large datasets.");
        answers.add("False");

        questions.add("Radix sort is suitable for sorting floating-point numbers.");
        answers.add("True");

        questions.add("Binary search can be applied to a linked list.");
        answers.add("False");

        questions.add("The Sieve of Eratosthenes is used to find all prime numbers up to a given limit.");
        answers.add("True");

        questions.add("Depth-first search (DFS) is implemented using a stack data structure.");
        answers.add("True");

        questions.add("Breadth-first search (BFS) explores neighbors before moving on to the next level of nodes.");
        answers.add("True");

        questions.add("Quicksort performs well on already sorted arrays.");
        answers.add("False");

        questions.add("Heapsort is not an in-place sorting algorithm.");
        answers.add("False");

        questions.add("Merge sort has a worst-case time complexity of O(n^2).");
        answers.add("False");

        questions.add("Prim's algorithm can be used to find the shortest path in an unweighted graph.");
        answers.add("False");

        questions.add("Dijkstra's algorithm does not work with negative edge weights.");
        answers.add("True");

        questions.add("Topological sorting can only be applied to directed acyclic graphs (DAGs).");
        answers.add("True");

        questions.add("The Floyd-Warshall algorithm is used to detect negative weight cycles in a graph.");
        answers.add("True");

        questions.add("The Bellman-Ford algorithm is more efficient than Dijkstra's algorithm for finding the shortest path in graphs with negative edge weights.");
        answers.add("False");

        questions.add("The Knapsack problem cannot be solved using dynamic programming.");
        answers.add("False");

        questions.add("Dynamic programming and memoization are the same technique.");
        answers.add("False");

        questions.add("A polynomial-time algorithm has a time complexity of O(log n).");
        answers.add("False");

        questions.add("The Master Theorem applies to divide and conquer algorithms with overlapping subproblems.");
        answers.add("False");

    }

    public static void main(String[] args) {
        new Algorithms_TF(name).setVisible(true);
    }

}
