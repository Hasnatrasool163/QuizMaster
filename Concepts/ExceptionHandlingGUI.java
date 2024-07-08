package Concepts;

import javax.swing.SwingUtilities;

public class ExceptionHandlingGUI extends AbstractConceptsGUI {

    public ExceptionHandlingGUI() {
        super("Exception Handling in C++");
    }

    @Override
    protected String getTheoryText() {
        return """
               Exception Handling in C++ provides a way to handle runtime errors and abnormal conditions.
               
               Key Concepts:
               1. try, catch, throw keywords
               2. Standard Exception Classes: std::exception, std::runtime_error, etc.
               3. Uncaught Exceptions and Stack Unwinding
               4. Exception Specifications
               
               Example of Exception Handling:
               try {
                   // Code that may throw an exception
                   throw runtime_error("Error occurred");
               } catch (const exception& e) {
                   cout << "Exception caught: " << e.what() << endl;
               }
               """;
    }

    @Override
    protected String getExampleCode() {
        return """
               #include <iostream>
               #include <stdexcept>
               using namespace std;

               int main() {
                   try {
                       // Code that may throw an exception
                       throw runtime_error("Error occurred");
                   } catch (const exception& e) {
                       cout << "Exception caught: " << e.what() << endl;
                   }
                   return 0;
               }
               """;
    }

    @Override
    protected void addQuizQuestions() {
        addQuizQuestion("Exception Handling in C++ provides a mechanism to handle runtime errors.", true);
        addQuizQuestion("All exceptions in C++ are of type std::exception.", false);
        addQuizQuestion("Exception handling in C++ involves using try, catch, and throw keywords.", true);
        addQuizQuestion("It is mandatory to specify exception specifications for all functions in C++.", false);
        addQuizQuestion("Stack unwinding in C++ refers to the process of cleaning up after an exception is thrown.", true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExceptionHandlingGUI frame = new ExceptionHandlingGUI();
            frame.setVisible(true);
        });
    }
}
