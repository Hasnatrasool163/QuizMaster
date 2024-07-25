package ninthListFrames;

import frame.True_False_Questions;
public class OOP_TF extends True_False_Questions {

    public OOP_TF(String name) {
        super(name);
    }

// OOP : 57
    @Override
    public final void loadQuestions() {
        
        questions.add("In OOP, encapsulation refers to the bundling of data and methods that operate on that data within one unit.");
        answers.add("True");

        questions.add("A class can only inherit from one superclass in Java.");
        answers.add("True");

        questions.add("Polymorphism allows objects to be treated as instances of their parent class rather than their actual class.");
        answers.add("True");

        questions.add("In OOP, a method that overrides a superclass method must have the same return type.");
        answers.add("False");

        questions.add("The 'this' keyword in Java refers to the current instance of a class.");
        answers.add("True");

        questions.add("Interfaces in Java can have method implementations.");
        answers.add("True");

        questions.add("In OOP, abstraction means providing only essential information to the outside world and hiding the details.");
        answers.add("True");

        questions.add("A constructor in Java can have a return type.");
        answers.add("False");

        questions.add("Method overloading is a form of polymorphism.");
        answers.add("True");

        questions.add("In Java, a class can implement multiple interfaces.");
        answers.add("True");

        questions.add("An abstract class can be instantiated directly.");
        answers.add("False");

        questions.add("The 'super' keyword is used to refer to the immediate parent class object.");
        answers.add("True");

        questions.add("Inheritance represents an 'is-a' relationship.");
        answers.add("True");

        questions.add("In OOP, the principle of encapsulation is violated when private data is accessed directly.");
        answers.add("True");

        questions.add("A static method can access instance variables directly.");
        answers.add("False");

        questions.add("A final class in Java can be extended.");
        answers.add("False");

        questions.add("Composition is a design technique to implement has-a relationship in classes.");
        answers.add("True");

        questions.add("The default access modifier in Java allows access only within the same package.");
        answers.add("True");

        questions.add("The principle of polymorphism allows one interface to be used for a general class of actions.");
        answers.add("True");

        questions.add("Abstract classes in Java can have constructors.");
        answers.add("True");

        questions.add("Method overriding requires that the method signatures must be the same.");
        answers.add("True");

        questions.add("A nested class can access private members of its enclosing class.");
        answers.add("True");

        questions.add("In OOP, an object is an instance of a class.");
        answers.add("True");

        questions.add("Java supports multiple inheritance through classes.");
        answers.add("False");

        questions.add("A constructor can be private in Java.");
        answers.add("True");

        questions.add("Interfaces can extend multiple interfaces.");
        answers.add("True");

        questions.add("The 'instanceof' keyword in Java is used to check if an object is an instance of a specific class or interface.");
        answers.add("True");

        questions.add("Static methods can be overridden in Java.");
        answers.add("False");

        questions.add("A final method cannot be overridden in a subclass.");
        answers.add("True");

        questions.add("A class that has at least one abstract method must be declared abstract.");
        answers.add("True");

        questions.add("In OOP, cohesion refers to how closely related the responsibilities of a single module are.");
        answers.add("True");

        questions.add("Aggregation represents a stronger relationship than composition.");
        answers.add("False");

        questions.add("Encapsulation helps to achieve modularity and separation of concerns.");
        answers.add("True");

        questions.add("A private member of a class is accessible outside the class.");
        answers.add("False");

        questions.add("Method overloading means providing two or more separate methods in a class with the same name but different parameters.");
        answers.add("True");

        questions.add("In OOP, 'is-a' and 'has-a' relationships help in building complex class structures.");
        answers.add("True");

        questions.add("An abstract class can implement an interface without providing implementations for all of its methods.");
        answers.add("True");

        questions.add("Inheritance increases the complexity of the system by creating multiple copies of the base class.");
        answers.add("False");

        questions.add("A final variable in Java can be modified once it is initialized.");
        answers.add("False");

        questions.add("The main advantage of polymorphism is that it allows us to eliminate many if/else conditions.");
        answers.add("True");

        questions.add("A static variable is shared among all instances of a class.");
        answers.add("True");

        questions.add("In OOP, dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at compile time.");
        answers.add("False");

        questions.add("A class in Java can have multiple constructors.");
        answers.add("True");

        questions.add("The use of inheritance increases code duplication.");
        answers.add("False");

        questions.add("Abstraction and encapsulation are the same concepts in OOP.");
        answers.add("False");

        questions.add("A class declared as final cannot be subclassed.");
        answers.add("True");

        questions.add("In OOP, coupling refers to the degree of direct knowledge that one class has of another.");
        answers.add("True");

        questions.add("Static binding in Java occurs during runtime.");
        answers.add("False");

        questions.add("A static nested class can be instantiated without an instance of its enclosing class.");
        answers.add("True");

        questions.add("A class that contains an abstract method must be declared as abstract.");
        answers.add("True");

        questions.add("Method overriding in Java allows a subclass to provide a specific implementation of a method that is already defined in its superclass.");
        answers.add("True");

        questions.add("In Java, methods declared in an interface are by default public and abstract.");
        answers.add("True");

        questions.add("In OOP, encapsulation can be achieved by declaring class variables as private and providing public getter and setter methods.");
        answers.add("True");

        questions.add("A subclass inherits all methods from its superclass, including private methods.");
        answers.add("False");

        questions.add("The 'this' keyword can be used to invoke the current class constructor.");
        answers.add("True");

        questions.add("A static method can access non-static data members of the class.");
        answers.add("False");

        questions.add("In OOP, the state of an object is represented by its attributes.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new OOP_TF(name).setVisible(true);
    }

}
