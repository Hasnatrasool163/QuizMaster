package Concepts;

// Concept handler for C topics
public class CConceptHandler implements ConceptHandler{
    @Override
    public String getTheoryText() {
        return """
               C is a general-purpose programming language.
               - It is known for its efficiency and close-to-hardware capabilities.
               - Functions are the primary means of organizing code in C.
               - Pointers are a powerful feature used for memory management and accessing addresses directly.""";
    }

    @Override
    public String getExampleCode() {
        return """
               #include <stdio.h>
               
               // Function prototype
               void greet(char name[]);
               
               int main() {
                   char name[20];
                   printf("Enter your name: ");
                   scanf("%s", name);
                   greet(name);
                   return 0;
               }
               
               // Function definition
               void greet(char name[]) {
                   printf("Hello, %s!\n", name);
               }
               """;
    }

    @Override
    public String getQuizQuestions() {
        return """
               1. C functions can return multiple values. (True/False)
               2. Pointers in C are used for dynamic memory allocation. (True/False)
               3. Arrays are always passed by value in C. (True/False)
               4. C does not support object-oriented programming. (True/False)
               """;
    }

    @Override
    public String[] getCorrectAnswers() {
        return new String[] {
            "False",
            "True",
            "False",
            "True"
        };
    }
   
}

