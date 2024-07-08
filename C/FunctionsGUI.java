package C;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class FunctionsGUI extends AbstractConceptsGUI {

    public FunctionsGUI() {
        super("Functions in C");
    }

    @Override
    protected String getTheoryText() {
        return """
               Functions in C provide modularity and reusability by breaking down a program into smaller, manageable parts.
               
               Key Concepts:
               1. Function Declaration vs. Definition
               2. Function Prototypes
               3. Passing Arguments: Pass by Value vs. Pass by Reference
               4. Recursion and Recursive Functions
               
               Example of Function Definition:
               int add(int a, int b) {
                   return a + b;
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <stdio.h>

               int add(int a, int b) {
                   return a + b;
               }

               int main() {
                   int sum = add(5, 10);
                   printf("Sum: %d", sum);
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Functions in C provide modularity and reusability by breaking down a program into smaller parts.", true);
        addQuizQuestion("Function prototypes in C are required for all functions defined in a program.", false);
        addQuizQuestion("Passing arguments by reference in C allows the function to modify the original variable's value.", true);
        addQuizQuestion("Recursion in C is the process of a function calling itself.", true);
        addQuizQuestion("Functions cannot return values in C.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FunctionsGUI frame = new FunctionsGUI();
            frame.setVisible(true);
        });
    }
}
