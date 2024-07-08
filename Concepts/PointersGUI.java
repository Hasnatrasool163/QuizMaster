package Concepts;

import javax.swing.SwingUtilities;

public class PointersGUI extends AbstractConceptsGUI {

    public PointersGUI() {
        super("C++ Pointers");
    }

    @Override
    protected String getTheoryText() {
        return """
               Pointers in C++ are variables that store the memory address of another variable.
               
               Key Concepts:
               1. Pointer Declaration and Initialization
               2. Pointer Arithmetic
               3. Dereferencing Pointers
               4. Pointers and Arrays
               5. Pointers to Functions
               
               Example of Pointer Declaration:
               int* ptr; // Pointer to an integer
               
               Example of Using Pointers:
               int x = 10;
               int* ptr = &x; // ptr now holds the address of x
               *ptr = 20; // Changes the value of x to 20 using pointer
               
               
               #include <iostream>
                              using namespace std;
                              
                              void swap(int &x, int &y) {
                                  int temp = x;
                                  x = y;
                                  y = temp;
                              }
                              
                              int main() {
                                  int a = 5, b = 10;
                                  swap(a, b);
                                  cout << "a: " << a << ", b: " << b << endl; // Outputs: a: 10, b: 5
                                  return 0;
                              }
               
               
                References:
                    1. References are an alias for another variable.
                    2. Once a reference is assigned to a variable, it cannot be changed to refer to another variable.
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;

               int main() {
                   int x = 10;
                   int* ptr = &x;
                   
                   cout << "Value of x: " << x << endl;
                   cout << "Address of x: " << ptr << endl;
                   
                   *ptr = 20;
                   cout << "Updated value of x: " << x << endl;
                   
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Pointers in C++ store the memory address of another variable.", true);
        addQuizQuestion("Pointer arithmetic involves performing arithmetic operations directly on memory addresses.", true);
        addQuizQuestion("References are typically safer and easier to use than pointers.", true);
        addQuizQuestion("Pointers don't require memory like ordinary variables.", false);
        addQuizQuestion("References can be changed to refer to another variable.", false);
        addQuizQuestion("Dereferencing a pointer means accessing the value stored at the memory address it points to.", true);
        addQuizQuestion("Pointers can only point to variables of the same data type.", false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PointersGUI frame = new PointersGUI();
            frame.setVisible(true);
        });
    }
}
