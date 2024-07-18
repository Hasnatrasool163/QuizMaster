package fourthListFrames;

import frame.True_False_Questions;

public class DesignPatterns_TF extends True_False_Questions {

    public DesignPatterns_TF(String name) {
        super(name);
    }

// 54
    @Override
    public final void loadQuestions() {

        questions.add("Design patterns provide general solutions to common software design problems.");
        answers.add("True");

        questions.add("Design patterns can only be applied to object-oriented programming languages.");
        answers.add("False");

        questions.add("The Singleton pattern ensures a class has only one instance and provides a global point of access to it.");
        answers.add("True");

        questions.add("The Observer pattern is used to define a one-to-many dependency between objects.");
        answers.add("True");

        questions.add("The Factory Method pattern specifies that object creation should be delegated to subclasses.");
        answers.add("True");

        questions.add("In the Factory Method pattern, clients decide which concrete class to instantiate.");
        answers.add("False");

        questions.add("The Adapter pattern converts one interface into another that a client expects.");
        answers.add("True");

        questions.add("The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.");
        answers.add("True");

        questions.add("The Decorator pattern attaches additional responsibilities to an object dynamically.");
        answers.add("True");

        questions.add("The Proxy pattern provides a surrogate or placeholder for another object to control access to it.");
        answers.add("True");

        questions.add("The Command pattern encapsulates a request as an object, thereby letting you parameterize clients with different requests.");
        answers.add("True");

        questions.add("The Facade pattern provides a unified interface to a set of interfaces in a subsystem.");
        answers.add("True");

        questions.add("The Composite pattern allows you to compose objects into tree structures to represent part-whole hierarchies.");
        answers.add("True");

        questions.add("The Bridge pattern decouples an abstraction from its implementation so that the two can vary independently.");
        answers.add("True");

        questions.add("The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.");
        answers.add("True");

        questions.add("The Observer pattern uses inheritance to establish dependencies between objects.");
        answers.add("False");

        questions.add("The Iterator pattern is used to access the elements of an aggregate object sequentially without exposing its underlying representation.");
        answers.add("True");

        questions.add("The Flyweight pattern is used to ensure a class has only one instance and provides a global point of access to it.");
        answers.add("False");

        questions.add("The State pattern allows an object to alter its behavior when its internal state changes.");
        answers.add("True");

        questions.add("The Visitor pattern allows for adding new operations to existing object structures without modifying them.");
        answers.add("True");

        questions.add("The Chain of Responsibility pattern decouples senders and receivers of requests.");
        answers.add("True");

        questions.add("The Mediator pattern defines an object that encapsulates how a set of objects interact.");
        answers.add("True");

        questions.add("The Proxy pattern restricts access to certain methods of an object.");
        answers.add("True");

        questions.add("The Prototype pattern specifies that new objects can be created by cloning existing objects.");
        answers.add("True");

        questions.add("The Singleton pattern violates the Single Responsibility Principle.");
        answers.add("True");

        questions.add("The Strategy pattern allows clients to choose from a family of algorithms at runtime.");
        answers.add("True");

        questions.add("The Abstract Factory pattern defines an interface for creating families of related or dependent objects without specifying their concrete classes.");
        answers.add("True");

        questions.add("The Null Object pattern ensures that null references are handled gracefully in the application.");
        answers.add("True");

        questions.add("The Memento pattern is used to restore an object to its previous state.");
        answers.add("True");

        questions.add("The Facade pattern simplifies a complex subsystem by providing a higher-level interface.");
        answers.add("True");

        questions.add("The Builder pattern separates the construction of a complex object from its representation.");
        answers.add("True");

        questions.add("The Command pattern decouples the sender and receiver of a request.");
        answers.add("True");

        questions.add("The Adapter pattern changes the interface of an existing object.");
        answers.add("True");

        questions.add("The Chain of Responsibility pattern guarantees that every request is handled by a handler.");
        answers.add("False");

        questions.add("The Proxy pattern controls access to the original object by acting as a surrogate.");
        answers.add("True");

        questions.add("The Template Method pattern uses delegation rather than inheritance to implement algorithm variations.");
        answers.add("False");

        questions.add("The Interpreter pattern is used to encapsulate how a set of objects interact in a complex system.");
        answers.add("False");

        questions.add("The Observer pattern allows one object to change the state of another object.");
        answers.add("False");

        questions.add("The Bridge pattern links two unrelated interfaces together.");
        answers.add("False");

        questions.add("The Composite pattern allows clients to treat individual objects and compositions of objects uniformly.");
        answers.add("True");

        questions.add("The Mediator pattern promotes loose coupling by keeping objects from referring to each other explicitly.");
        answers.add("True");

        questions.add("The Visitor pattern allows adding new operations to existing object structures without modifying those structures.");
        answers.add("True");

        questions.add("The State pattern is used to alter the behavior of an object when its state changes.");
        answers.add("True");

        questions.add("The Flyweight pattern is used to create multiple instances of an object.");
        answers.add("False");

        questions.add("The Null Object pattern replaces null values with default objects.");
        answers.add("True");

        questions.add("The Proxy pattern restricts access to certain methods of an object.");
        answers.add("True");

        questions.add("The Bridge pattern is used to decouple an abstraction from its implementation.");
        answers.add("True");

        questions.add("The Facade pattern provides a unified interface to a set of interfaces in a subsystem.");
        answers.add("True");

        questions.add("The Interpreter pattern specifies how to create objects.");
        answers.add("False");

        questions.add("The Adapter pattern converts one interface into another that clients expect.");
        answers.add("True");

        questions.add("The Command pattern is used to define a family of algorithms.");
        answers.add("False");

        questions.add("The Strategy pattern encapsulates a request as an object.");
        answers.add("False");

        questions.add("The Composite pattern allows you to compose objects into tree structures.");
        answers.add("True");

        questions.add("The Builder pattern separates the construction of a complex object from its representation.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new DesignPatterns_TF(name).setVisible(true);
    }

}
