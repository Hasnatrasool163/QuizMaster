package Concepts;

import javax.swing.SwingUtilities;

public class DynamicProgrammingGUI extends AbstractConceptsGUI {

    public DynamicProgrammingGUI() {
        super("Dynamic Programming in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Dynamic Programming (DP) in Java is a technique to solve problems by breaking them down into overlapping subproblems.
               
               Key Concepts:
               1. Memoization vs. Tabulation
               2. Fibonacci Sequence using DP
               3. Knapsack Problem
               4. Longest Common Subsequence
               
               Example of Fibonacci Sequence using DP:
               int fib(int n) {
                   int[] dp = new int[n+1];
                   dp[0] = 0;
                   dp[1] = 1;

                   for (int i = 2; i <= n; i++) {
                       dp[i] = dp[i-1] + dp[i-2];
                   }

                   return dp[n];
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   // Example of Fibonacci Sequence using Dynamic Programming
                   static int fib(int n) {
                       int[] dp = new int[n+1];
                       dp[0] = 0;
                       dp[1] = 1;

                       for (int i = 2; i <= n; i++) {
                           dp[i] = dp[i-1] + dp[i-2];
                       }

                       return dp[n];
                   }

                   public static void main(String[] args) {
                       System.out.println("Fibonacci of 6: " + fib(6));
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Dynamic Programming in Java solves problems by breaking them into overlapping subproblems.", true);
        addQuizQuestion("Memoization is a bottom-up approach in Dynamic Programming.", false);
        addQuizQuestion("The Knapsack Problem is an example of a problem solved using Dynamic Programming.", true);
        addQuizQuestion("Dynamic Programming is only applicable to problems with optimal substructure.", false);
        addQuizQuestion("Tabulation is a top-down approach in Dynamic Programming.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DynamicProgrammingGUI frame = new DynamicProgrammingGUI();
            frame.setVisible(true);
        });
    }
}
