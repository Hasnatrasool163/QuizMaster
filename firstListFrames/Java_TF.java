package firstListFrames;

import frame.True_False_Questions;

public class Java_TF extends True_False_Questions {

    public Java_TF(String name) {
        super(name);
    }

    @Override
    public final void loadQuestions() {

        questions.add("In Java, a static method can access non-static variables directly.");
        answers.add("False");

        questions.add("The 'this' keyword in Java can be used to refer to the current class instance variable.");
        answers.add("True");

        questions.add("An inner class can access the private members of its outer class.");
        answers.add("True");

        questions.add("The 'super' keyword can be used to call a method in the parent class from the child class.");
        answers.add("True");

        questions.add("A static nested class can only access static members of the outer class.");
        answers.add("True");

        questions.add("The 'equals' method in Java compares the reference of two objects, not their content.");
        answers.add("False");

        questions.add("The 'hashCode' method in Java is used to get a unique identifier for each object.");
        answers.add("False");

        questions.add("Two different objects can have the same 'hashCode' value in Java.");
        answers.add("True");

        questions.add("The '==' operator in Java compares the content of two strings.");
        answers.add("False");

        questions.add("In Java, a recursive method is a method that calls itself.");
        answers.add("True");

        questions.add("Threads in Java can be created by implementing the Runnable interface or extending the Thread class.");
        answers.add("True");

        questions.add("The 'toString' method in Java is automatically called when an object is printed.");
        answers.add("True");

        questions.add("In Java, a constructor can be declared as static.");
        answers.add("False");

        questions.add("Abstract classes in Java cannot have constructors.");
        answers.add("False");

        questions.add("The 'final' keyword in Java can be used with classes, methods, and variables.");
        answers.add("True");

        questions.add("A class can implement multiple interfaces in Java.");
        answers.add("True");

        questions.add("Java supports multiple inheritance through classes.");
        answers.add("False");

        questions.add("The 'volatile' keyword in Java indicates that a variable may be changed unexpectedly.");
        answers.add("True");

        questions.add("A thread in Java can be restarted once it has been stopped.");
        answers.add("False");

        questions.add("Anonymous inner classes in Java can extend a class or implement an interface.");
        answers.add("True");

        questions.add("In Java, the 'finally' block is executed only if an exception is thrown.");
        answers.add("False");

        questions.add("The 'instanceof' operator in Java is used to check if an object is an instance of a specific class or interface.");
        answers.add("True");

        questions.add("Interfaces in Java can have method implementations.");
        answers.add("True");

        questions.add("Java supports operator overloading.");
        answers.add("False");

        questions.add("A 'protected' member in Java is accessible within the same package and subclasses in different packages.");
        answers.add("True");

        questions.add("The default access modifier in Java is 'public'.");
        answers.add("False");

        questions.add("A 'synchronized' method in Java can be accessed by multiple threads simultaneously.");
        answers.add("False");

        questions.add("Local variables in Java are automatically initialized to default values.");
        answers.add("False");

        questions.add("Enums in Java can have methods and constructors.");
        answers.add("True");

        questions.add("Java's 'Object' class is the superclass of all classes in Java.");
        answers.add("True");

        questions.add("In Java, a method can be overloaded based on its return type alone.");
        answers.add("False");

        questions.add("The 'transient' keyword in Java indicates that a variable should not be serialized.");
        answers.add("True");

        questions.add("Java's 'StackOverflowError' is a type of 'RuntimeException'.");
        answers.add("True");

        questions.add("The 'assert' keyword in Java is used for debugging purposes.");
        answers.add("True");

        questions.add("In Java, a class can extend multiple abstract classes.");
        answers.add("False");

        questions.add("The 'clone' method in Java is used to create a deep copy of an object.");
        answers.add("False");

        questions.add("Java's 'HashMap' class is thread-safe.");
        answers.add("False");

        questions.add("The 'wait' method in Java is used to release the lock on an object.");
        answers.add("True");

        questions.add("In Java, a method can throw multiple exceptions using the 'throw' keyword.");
        answers.add("False");

        questions.add("Java's 'String' class is mutable.");
        answers.add("False");

        questions.add("The 'System.out.println' method in Java is synchronized.");
        answers.add("True");

        questions.add("In Java, a variable declared as 'final' can be changed after it's initialized.");
        answers.add("False");

        questions.add("Java's 'ArrayList' class uses a linked list as its underlying data structure.");
        answers.add("False");

        questions.add("The 'Thread.sleep' method in Java is used to pause the execution of a thread for a specified time.");
        answers.add("True");

        questions.add("In Java, a lambda expression can be used as a substitute for an abstract class.");
        answers.add("False");

        questions.add("The 'sealed' keyword in Java is used to restrict the inheritance of a class.");
        answers.add("True");

        questions.add("Java's 'Optional' class is used to handle null values.");
        answers.add("True");

        questions.add("The 'var' keyword in Java is used to declare a variable with a dynamically-typed type.");
        answers.add("True");

        questions.add("In Java, a record class is a type of class that has a fixed set of fields.");
        answers.add("True");

        questions.add("The 'yield' keyword in Java is used in the context of a generator to produce a value.");
        answers.add("False");

        questions.add("Java's 'Stream' API is used for functional programming.");
        answers.add("True");

        questions.add("The 'java.util.function' package in Java provides functional interfaces for functional programming.");
        answers.add("True");

        questions.add("In Java, a method reference can be used as a substitute for a lambda expression.");
        answers.add("True");

        questions.add("In Java, a nested class can access the private members of its outer class.");
        answers.add("True");

        questions.add("The 'java.lang.Math' class in Java contains methods for mathematical functions.");
        answers.add("True");

        questions.add("Java's 'BigInteger' class is used for arithmetic operations on large integers.");
        answers.add("True");

        questions.add("The 'java.time' package in Java provides classes for working with dates and times.");
        answers.add("True");

        questions.add("In Java, a switch statement can be used with a String variable.");
        answers.add("True");

        questions.add("Java's 'ClassLoader' class is used to load classes dynamically.");
        answers.add("True");

        questions.add("The 'java.lang.reflect' package in Java provides classes for reflection.");
        answers.add("True");

        questions.add("In Java, a method can be declared with a variable number of arguments using the '...' syntax.");
        answers.add("True");

        questions.add("Java's 'java.awt' package is used for graphical user interface programming.");
        answers.add("True");

        questions.add("In Java, a static block can access instance variables of a class.");
        answers.add("False");

        questions.add("In Java, a static block will execute before an instance block, even if an object of the class is created.");
        answers.add("False"); // Because when an object is created, the instance block executes before the static block

        questions.add("In Java, an instance block will execute before a static block when the class is initialized for the first time.");
        answers.add("False"); // Because when the class is initialized for the first time, the static block executes before the instance block

        questions.add("In Java, a static block will execute only once, when the class is loaded, and never again, even if an object of the class is created.");
        answers.add("True"); // Because a static block executes only once when the class is initialized, and not again when an object is created

        questions.add("The 'FileInputStream' class in Java is used to read data from a file in binary format.");
        answers.add("True");

        questions.add("The 'BufferedWriter' class in Java is used to write text data to a file with efficient buffering.");
        answers.add("True");

        questions.add("In Java, a Swing component must be created on the Event-Dispatching Thread (EDT) to avoid thread-safety issues.");
        answers.add("True");

        questions.add("The 'transient' keyword in Java can be used to prevent a variable from being serialized, but it does not affect the serialization of the object as a whole.");
        answers.add("False");

        questions.add("In Java, the 'volatile' keyword can be used to make a variable thread-safe.");
        answers.add("False"); // volatile only ensures visibility, not thread-safety

        questions.add("The 'java.lang.Class' class in Java represents a class or interface at runtime.");
        answers.add("True");

        questions.add("In Java, the 'finalize' method is called by the garbage collector before an object is destroyed.");
        answers.add("True");

        questions.add("The 'java.lang.StackTraceElement' class in Java represents a single element of a stack trace.");
        answers.add("True");

        questions.add("In Java, the 'strictfp' keyword can be used to restrict floating-point calculations to ensure portability.");
        answers.add("True");

    }

    public static void main(String[] args) {
        new Java_TF(name).setVisible(true);
    }

}
