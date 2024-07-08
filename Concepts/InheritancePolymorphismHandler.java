package Concepts;

class InheritancePolymorphismHandler implements ConceptHandler {
    @Override
    public String getTheoryText() {
        return """
               Inheritance:
               1. Allows a class to inherit properties and methods from another class.
               2. Promotes code reusability.
               
               Polymorphism:
               1. Allows methods to perform differently based on the object that it is acting upon.
               2. Achieved through method overriding and method overloading.
               """;
    }

    @Override
    public String getExampleCode() {
        return """
               class Animal {
                   void sound() {
                       System.out.println("Animal makes a sound");
                   }
               }
               
               class Dog extends Animal {
                   @Override
                   void sound() {
                       System.out.println("Dog barks");
                   }
               }
               
               public class TestPolymorphism {
                   public static void main(String[] args) {
                       Animal myDog = new Dog();
                       myDog.sound(); // Outputs: Dog barks
                   }
               }
               """;
    }

    @Override
    public String getQuizQuestions() {
        return """
               1. Inheritance promotes code reusability. (True/False)
               2. Polymorphism is achieved through method overloading and method overriding. (True/False)
               3. In the example, myDog.sound() will output "Animal makes a sound". (True/False)
               4. Method overloading allows methods in a class to have the same name but different parameters. (True/False)
               """;
    }

    @Override
    public String[] getCorrectAnswers() {
        return new String[] {
            "True",
            "True",
            "False",
            "True"
        };
    }
}


