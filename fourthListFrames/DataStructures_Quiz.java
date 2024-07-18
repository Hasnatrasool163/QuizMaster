package fourthListFrames;


import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class DataStructures_Quiz extends Quiz {

    public DataStructures_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
    }

    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }


    @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

    // questions:38
    @Override
    public final void loadQuestions() {

        questions.add("What is the time complexity of searching an element in a balanced binary search tree?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a stack using dynamic memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("B) Linked List");

        questions.add("What is the space complexity of a hash table with chaining?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("Which algorithm is used to find the shortest path in a graph with negative weight edges?");
        options.add("A) Dijkstra's algorithm, B) Bellman-Ford algorithm, C) Floyd-Warshall algorithm, D) Topological Sort");
        answers.add("B) Bellman-Ford algorithm");

        questions.add("What is the time complexity of inserting an element in a heap?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a queue using static memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("A) Array");

        questions.add("What is the space complexity of a binary search tree with n nodes?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("Which algorithm is used to find the maximum flow in a flow network?");
        options.add("A) Ford-Fulkerson algorithm, B) Edmonds-Karp algorithm, C) Dinic's algorithm, D) Push-Relabel algorithm");
        answers.add("A) Ford-Fulkerson algorithm");

        questions.add("What is the time complexity of deleting an element from a hash table with chaining?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("A) O(n)");

        questions.add("Which data structure is used to implement a graph using adjacency list representation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("B) Linked List");

        questions.add("What is the space complexity of a trie data structure?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("Which algorithm is used to find the minimum spanning tree of a graph?");
        options.add("A) Kruskal's algorithm, B) Prim's algorithm, C) Dijkstra's algorithm, D) Bellman-Ford algorithm");
        answers.add("A) Kruskal's algorithm");

        questions.add("What is the time complexity of finding the union of two sets using the union-find algorithm?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a stack using static memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("A) Array");

        questions.add("What is the space complexity of a binary search tree with n nodes and height h?");
        options.add("A) O(n), B) O(n^2), C) O(h), D) O(log n)");
        answers.add("C) O(h)");

        questions.add("Which algorithm is used to find the longest common subsequence of two strings?");
        options.add("A) Dynamic Programming, B) Greedy algorithm, C) Backtracking algorithm, D) Divide and Conquer algorithm");
        answers.add("A) Dynamic Programming");

        questions.add("What is the time complexity of inserting an element in a binary search tree?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a queue using dynamic memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("B) Linked List");

        questions.add("What is the space complexity of a hash table with open addressing?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("What is the time complexity of finding the maximum element in a heap?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a graph using adjacency matrix representation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("A) Array");

        questions.add("What is the space complexity of a trie data structure with n nodes?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("Which algorithm is used to find the minimum cost flow in a flow network?");
        options.add("A) Ford-Fulkerson algorithm, B) Edmonds-Karp algorithm, C) Dinic's algorithm, D) Successive Shortest Paths algorithm");
        answers.add("D) Successive Shortest Paths algorithm");

        questions.add("What is the time complexity of inserting an element in a binary search tree with n nodes?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a stack using dynamic memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("B) Linked List");

        questions.add("What is the space complexity of a hash table with chaining and n buckets?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

        questions.add("Which algorithm is used to find the longest increasing subsequence of an array?");
        options.add("A) Dynamic Programming, B) Greedy algorithm, C) Backtracking algorithm, D) Divide and Conquer algorithm");
        answers.add("A) Dynamic Programming");

        questions.add("What is the time complexity of finding the union of two sets using the union-find algorithm?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a queue using static memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("A) Array");

        questions.add("What is the space complexity of a binary search tree with n nodes and height h?");
        options.add("A) O(n), B) O(n^2), C) O(h), D) O(log n)");
        answers.add("C) O(h)");

        questions.add("Which algorithm is used to find the shortest path in a graph with negative weight edges?");
        options.add("A) Dijkstra's algorithm, B) Bellman-Ford algorithm, C) Floyd-Warshall algorithm, D) Topological Sort");
        answers.add("B) Bellman-Ford algorithm");

        questions.add("What is the time complexity of deleting an element from a hash table with open addressing?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("A) O(n)");

        questions.add("Which data structure is used to implement a graph using adjacency list representation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("B) Linked List");

        questions.add("What is the space complexity of a trie data structure with n nodes and height h?");
        options.add("A) O(n), B) O(n^2), C) O(h), D) O(log n)");
        answers.add("C) O(h)");

        questions.add("Which algorithm is used to find the maximum flow in a flow network?");
        options.add("A) Ford-Fulkerson algorithm, B) Edmonds-Karp algorithm, C) Dinic's algorithm, D) Push-Relabel algorithm");
        answers.add("A) Ford-Fulkerson algorithm");

        questions.add("What is the time complexity of finding the minimum element in a heap?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(1)");
        answers.add("B) O(log n)");

        questions.add("Which data structure is used to implement a stack using static memory allocation?");
        options.add("A) Array, B) Linked List, C) Tree, D) Graph");
        answers.add("A) Array");

        questions.add("What is the space complexity of a binary search tree with n nodes?");
        options.add("A) O(n), B) O(n^2), C) O(1), D) O(log n)");
        answers.add("A) O(n)");

    }

    public static void main(String[] args) {
        new DataStructures_Quiz(name).setVisible(true);
    }

}
