package C;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class PointersGUI extends AbstractConceptsGUI {

    public PointersGUI() {
        super("Pointers in C");
    }

    @Override
    protected String getTheoryText() {
        return """
               Pointers in C are variables that store memory addresses.
               
               Key Concepts:
               1. Pointer Arithmetic
               2. Pointer to Pointer (Double Pointer)
               3. Null Pointers and Void Pointers
               4. Array and Function Pointers
               
               Example of Pointer Usage:
               int var = 10;
               int *ptr;
               ptr = &var;
               printf("Value of var: %d", *ptr);
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <stdio.h>

               int main() {
                   int var = 10;
                   int *ptr;
                   ptr = &var;
                   printf("Value of var: %d", *ptr);
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Pointers in C are variables that store memory addresses.", true);
        addQuizQuestion("Pointer arithmetic in C allows adding and subtracting integers to pointers.", true);
        addQuizQuestion("Double pointers in C are used to store the address of another pointer.", true);
        addQuizQuestion("Void pointers in C can be dereferenced.", false);
        addQuizQuestion("Array pointers and function pointers are not supported in C.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PointersGUI frame = new PointersGUI();
            frame.setVisible(true);
        });
    }
}
