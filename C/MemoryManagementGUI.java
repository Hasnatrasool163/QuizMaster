package C;

import Concepts.AbstractConceptsGUI;
import javax.swing.SwingUtilities;

public class MemoryManagementGUI extends AbstractConceptsGUI {

    public MemoryManagementGUI() {
        super("Memory Management in C");
    }

    @Override
    protected String getTheoryText() {
        return """
               Memory Management in C involves allocating and deallocating memory for variables and data structures.
               
               Key Concepts:
               1. Stack vs. Heap Memory
               2. malloc(), calloc(), realloc(), free() functions
               3. Memory Leaks and Dangling Pointers
               4. Dynamic Memory Allocation
               
               Example of Dynamic Memory Allocation:
               int* ptr;
               ptr = (int*) malloc(5 * sizeof(int));
               if (ptr == NULL) {
                   printf("Memory allocation failed");
                   exit(1);
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <stdio.h>
               #include <stdlib.h>

               int main() {
                   int* ptr;
                   ptr = (int*) malloc(5 * sizeof(int));
                   if (ptr == NULL) {
                       printf("Memory allocation failed");
                       exit(1);
                   }
                   free(ptr);
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Stack memory in C is used for dynamically allocated variables.", false);
        addQuizQuestion("malloc() function in C is used to allocate memory on the heap.", true);
        addQuizQuestion("Memory leaks in C occur when allocated memory is not properly deallocated.", true);
        addQuizQuestion("realloc() function in C is used to free allocated memory.", false);
        addQuizQuestion("Dynamic memory allocation in C allows programs to request memory dynamically during runtime.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MemoryManagementGUI frame = new MemoryManagementGUI();
            frame.setVisible(true);
        });
    }
}
