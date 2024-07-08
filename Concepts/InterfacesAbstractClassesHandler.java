package Concepts;


class InterfacesAbstractClassesHandler implements ConceptHandler {
    public String getTheoryText() {
        return """
               Interfaces:
               1. Interfaces can only contain abstract methods (until Java 8).
               2. Interfaces are implemented by classes using the 'implements' keyword.
               
               Abstract Classes:
               1. Abstract classes can have both abstract and concrete methods.
               2. Abstract classes are extended by subclasses using the 'extends' keyword.
               """;
    }

    public String getExampleCode() {
        return """
               interface Animal {
                   void eat();
               }
               
               abstract class Mammal implements Animal {
                   public void eat() {
                       System.out.println("Mammal eats");
                   }
               }
               
               class Dog extends Mammal {
                   public void bark() {
                       System.out.println("Dog barks");
                   }
               }
               
               public class TestInheritance {
                   public static void main(String[] args) {
                       Dog myDog = new Dog();
                       myDog.eat(); // Outputs: Mammal eats
                       myDog.bark(); // Outputs: Dog barks
                   }
               }
               """;
    }

    public String getQuizQuestions() {
        return """
               1. Interfaces can contain concrete methods in Java 8 and beyond. (True/False)
               2. Abstract classes can have concrete methods. (True/False)
               3. In the example, myDog.eat() will output "Dog eats". (True/False)
               4. A class can implement multiple interfaces but can extend only one abstract class. (True/False)
               """;
    }

    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "True",
            "False",
            "True"
        };
    }
}
