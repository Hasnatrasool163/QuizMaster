
package Concepts;

// Concept handler for Java topics
class JavaConceptHandler {
    public String getTheoryText() {
        return """
               Java is a high-level, object-oriented programming language.
               - Objects are instances of classes, encapsulating data and behaviors.
               - Inheritance allows creating new classes based on existing ones.
               - Interfaces provide a way to achieve abstraction and multiple inheritance.""";
    }

    public String getExampleCode() {
        return """
               public class HelloWorld {
                   public static void main(String[] args) {
                       System.out.println("Hello, World!");
                   }
               }
               """;
    }

    public String getQuizQuestions() {
        return """
               1. Java allows multiple inheritance of classes. (True/False)
               2. Interfaces in Java can have method implementations. (True/False)
               3. In Java, a method declared as 'static' can be overridden. (True/False)
               4. Java uses pointers extensively for memory management. (True/False)
               """;
    }
}

