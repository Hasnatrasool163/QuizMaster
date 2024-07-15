package Java;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class RecursionGUI extends AbstractConceptsGUI {

    public RecursionGUI() {
        super("Recursion in Java");
    }

    @Override
    protected String getTheoryText() {
        return """
               Recursion in Java is a technique where a method calls itself to solve a problem.
               
               Key Concepts:
               1. Base Case and Recursive Case
               2. Recursive vs. Iterative Solutions
               3. Tail Recursion
               4. Examples: Factorial, Fibonacci
               
               Example of Factorial Calculation using Recursion:
               int factorial(int n) {
                   if (n == 0 || n == 1) {
                       return 1;
                   }
                   return n * factorial(n - 1);
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               public class Main {
                   // Example of Factorial Calculation using Recursion
                   static int factorial(int n) {
                       if (n == 0 || n == 1) {
                           return 1;
                       }
                       return n * factorial(n - 1);
                   }

                   public static void main(String[] args) {
                       System.out.println("Factorial of 5: " + factorial(5)); // 120
                   }
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Recursion in Java involves a method calling itself.", true);
        addQuizQuestion("Recursive methods cannot have a base case.", false);
        addQuizQuestion("Tail recursion is less memory-efficient than non-tail recursion.", false);
        addQuizQuestion("Recursion is always more efficient than iterative solutions.", false);
        addQuizQuestion("The factorial of 0 is 1.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RecursionGUI frame = new RecursionGUI();
            frame.setVisible(true);
        });
    }
}
