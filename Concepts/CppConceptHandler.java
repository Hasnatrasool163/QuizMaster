package Concepts;

// Concept handler for C++ topics
public class CppConceptHandler implements ConceptHandler{
    @Override
    public String getTheoryText() {
        return """
               C++ is an extension of C with object-oriented programming features.
               - It supports classes and objects, enabling data abstraction and encapsulation.
               - Inheritance allows deriving new classes from existing ones.
               - Templates provide a powerful mechanism for generic programming.""";
    }

    @Override
    public String getExampleCode() {
        return """
               #include <iostream>
               using namespace std;
               
               // Template function
               template <typename T>
               T add(T a, T b) {
                   return a + b;
               }
               
               int main() {
                   cout << "Sum of integers: " << add(5, 10) << endl;
                   cout << "Sum of doubles: " << add(3.5, 2.7) << endl;
                   return 0;
               }
               """;
    }

    @Override
    public String getQuizQuestions() {
        return """
               1. C++ supports multiple inheritance. (True/False)
               2. Templates in C++ allow functions to work with any data type. (True/False)
               3. Polymorphism in C++ allows objects to be treated as instances of their base class. (True/False)
               4. Encapsulation in C++ refers to hiding data within an object to prevent direct access. (True/False)
               """;
    }

    @Override
    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "True",
            "True",
            "True"
        };
    }
    
}
