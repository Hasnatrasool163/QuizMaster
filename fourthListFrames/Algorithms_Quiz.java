package fourthListFrames;

import frame.Quiz;

/**
 * @author MuhammadHasnatRasool
 */

public class Algorithms_Quiz extends Quiz{
    

    public Algorithms_Quiz(String name) {
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


    @Override
    public final void loadQuestions() {
  
       // 16
        questions.add("What is the time complexity of a bubble sort algorithm?");
        options.add("A) O(n), B) O(n log n), C) O(n^2), D) O(2^n)");
        answers.add("C) O(n^2)");

        questions.add("Which algorithm is used to find the shortest path in a graph?");
        options.add("A) Breadth-First Search (BFS), B) Depth-First Search (DFS), C) Dijkstra's algorithm, D) Bellman-Ford algorithm");
        answers.add("C) Dijkstra's algorithm");

        questions.add("What is the space complexity of a recursive algorithm?");
        options.add("A) O(1), B) O(log n), C) O(n), D) O(n^2)");
        answers.add("C) O(n)");

        questions.add("Which algorithm is used to sort a list of elements in descending order?");
        options.add("A) Quick sort, B) Merge sort, C) Heap sort, D) Selection sort");
        answers.add("C) Heap sort");

        questions.add("What is the time complexity of a binary search algorithm?");
        options.add("A) O(n), B) O(log n), C) O(n log n), D) O(2^n)");
        answers.add("B) O(log n)");

        questions.add("Which algorithm is used to find the maximum element in an array?");
        options.add("A) Linear search, B) Binary search, C) Selection sort, D) Max-heap algorithm");
        answers.add("D) Max-heap algorithm");

        questions.add("What is the space complexity of a dynamic programming algorithm?");
        options.add("A) O(1), B) O(log n), C) O(n), D) O(n^2)");
        answers.add("C) O(n)");

        questions.add("Which algorithm is used to solve the traveling salesman problem?");
        options.add("A) Greedy algorithm, B) Dynamic programming, C) Backtracking algorithm, D) Branch and bound algorithm");
        answers.add("D) Branch and bound algorithm");

        questions.add("What is the time complexity of a selection sort algorithm?");
        options.add("A) O(n), B) O(n log n), C) O(n^2), D) O(2^n)");
        answers.add("C) O(n^2)");

        questions.add("Which algorithm is used to find the minimum spanning tree of a graph?");
        options.add("A) Kruskal's algorithm, B) Prim's algorithm, C) Dijkstra's algorithm, D) Bellman-Ford algorithm");
        answers.add("A) Kruskal's algorithm");

        questions.add("What is the space complexity of a hash table?");
        options.add("A) O(1), B) O(log n), C) O(n), D) O(n^2)");
        answers.add("C) O(n)");

        questions.add("Which algorithm is used to solve the knapsack problem?");
        options.add("A) Greedy algorithm, B) Dynamic programming, C) Backtracking algorithm, D) Branch and bound algorithm");
        answers.add("B) Dynamic programming");

        questions.add("What is the time complexity of a merge sort algorithm?");
        options.add("A) O(n), B) O(n log n), C) O(n^2), D) O(2^n)");
        answers.add("B) O(n log n)");

        questions.add("Which algorithm is used to find the longest common subsequence of two strings?");
        options.add("A) Dynamic programming, B) Backtracking algorithm, C) Greedy algorithm, D) Divide and conquer algorithm");
        answers.add("A) Dynamic programming");

        questions.add("What is the space complexity of a stack data structure?");
        options.add("A) O(1), B) O(log n), C) O(n), D) O(n^2)");
        answers.add("C) O(n)");

        questions.add("Which algorithm is used to solve the scheduling problem?");
        options.add("A) Greedy algorithm, B) Dynamic programming, C) Backtracking algorithm, D) Branch and bound algorithm");
        answers.add("B) Dynamic programming");
    }
    

    public static void main(String[]args){
        new Algorithms_Quiz(name).setVisible(true);
    }
    
}
