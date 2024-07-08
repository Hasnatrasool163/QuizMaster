package Concepts;

import javax.swing.SwingUtilities;

public class TemplatesGUI extends AbstractConceptsGUI {

    public TemplatesGUI() {
        super("Templates in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Templates in C++ allow functions and classes to operate with generic types.
               
               Key Concepts:
               1. Function Templates
               2. Class Templates
               3. Template Specialization
               4. Generic Programming
               
               Example of Function Template:
               template <typename T>
               T add(T a, T b) {
                   return a + b;
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;

               template <typename T>
               T add(T a, T b) {
                   return a + b;
               }

               int main() {
                   cout << "Addition of integers: " << add(5, 10) << endl;
                   cout << "Addition of doubles: " << add(3.5, 2.5) << endl;
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Templates in C++ allow functions and classes to operate with generic types.", true);
        addQuizQuestion("Class templates can only work with primitive data types in C++.", false);
        addQuizQuestion("Template specialization in C++ allows customizing the behavior of a template for specific data types.", true);
        addQuizQuestion("Templates are resolved at run-time in C++.", false);
        addQuizQuestion("Function templates can be overloaded in C++.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemplatesGUI frame = new TemplatesGUI();
            frame.setVisible(true);
        });
    }
}
