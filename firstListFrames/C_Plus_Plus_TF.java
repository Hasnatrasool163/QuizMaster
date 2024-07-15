package firstListFrames;

import frame.True_False_Questions;

public class C_Plus_Plus_TF extends True_False_Questions{

    public C_Plus_Plus_TF(String name) {
        super(name);
    }

    // 67 tf
    

    @Override
    public final void loadQuestions() {
             
questions.add("In C++, a static method can access non-static variables directly.");
answers.add("False");

questions.add("The 'this' keyword in C++ can be used to refer to the current class instance variable.");
answers.add("True");

questions.add("An inner class can access the private members of its outer class.");
answers.add("True");

questions.add("The 'super' keyword can be used to call a method in the parent class from the child class.");
answers.add("False"); // C++ does not have a 'super' keyword

questions.add("A static nested class can only access static members of the outer class.");
answers.add("True");

questions.add("The '==' operator in C++ compares the content of two strings.");
answers.add("False"); // C++ does not have a built-in '==' operator for strings

questions.add("In C++, a recursive method is a method that calls itself.");
answers.add("True");

questions.add("Threads in C++ can be created by implementing the Runnable interface or extending the Thread class.");
answers.add("False"); // C++ does not have a built-in 'Runnable' interface or 'Thread' class

questions.add("The 'toString' method in C++ is automatically called when an object is printed.");
answers.add("False"); // C++ does not have a built-in 'toString' method

questions.add("In C++, a constructor can be declared as static.");
answers.add("False");

questions.add("Abstract classes in C++ cannot have constructors.");
answers.add("False");

questions.add("The 'final' keyword in C++ can be used with classes, methods, and variables.");
answers.add("False"); // C++ does not have a 'final' keyword

questions.add("A class can implement multiple interfaces in C++.");
answers.add("False"); // C++ does not have interfaces

questions.add("C++ supports multiple inheritance through classes.");
answers.add("True");

questions.add("The 'volatile' keyword in C++ indicates that a variable may be changed unexpectedly.");
answers.add("True");

questions.add("A thread in C++ can be restarted once it has been stopped.");
answers.add("False");

questions.add("Anonymous inner classes in C++ can extend a class or implement an interface.");
answers.add("False"); // C++ does not have anonymous inner classes

questions.add("In C++, the 'finally' block is executed only if an exception is thrown.");
answers.add("False"); // C++ does not have a 'finally' block

questions.add("The 'instanceof' operator in C++ is used to check if an object is an instance of a specific class or interface.");
answers.add("False"); // C++ does not have an 'instanceof' operator

questions.add("Interfaces in C++ can have method implementations.");
answers.add("False"); // C++ does not have interfaces

questions.add("C++ supports operator overloading.");
answers.add("True");

questions.add("A 'protected' member in C++ is accessible within the same package and subclasses in different packages.");
answers.add("False"); // C++ does not have packages

questions.add("The default access modifier in C++ is 'public'.");
answers.add("False"); // C++ does not have a default access modifier

questions.add("A 'synchronized' method in C++ can be accessed by multiple threads simultaneously.");
answers.add("False"); // C++ does not have a 'synchronized' keyword

questions.add("Local variables in C++ are automatically initialized to default values.");
answers.add("False");

questions.add("Enums in C++ can have methods and constructors.");
answers.add("True");

questions.add("C++'s 'Object' class is the superclass of all classes in C++.");
answers.add("False"); // C++ does not have a built-in 'Object' class

questions.add("In C++, a method can be overloaded based on its return type alone.");
answers.add("False");

questions.add("The 'transient' keyword in C++ indicates that a variable should not be serialized.");
answers.add("False"); 

questions.add("In C++, a static constructor (constructor of a static object) runs before main() starts.");
answers.add("True"); // Because static constructors run before main() starts

questions.add("In C++, a non-static constructor (constructor of a non-static object) runs on the free store (heap).");
answers.add("False"); // Because non-static constructors run on the stack, not the heap

questions.add("In C++, static members (variables and functions) of a class are shared among all objects of the class.");
answers.add("True"); // Because static members are shared among all objects of the class

questions.add("In C++, a constructor can have a return type.");
answers.add("False"); // Because constructors don't have a return type

questions.add("In C++, a destructor can throw an exception.");
answers.add("False"); // Because destructors shouldn't throw exceptions

questions.add("In C++, a static variable is initialized only once.");
answers.add("True"); // Because static variables are initialized only once

questions.add("In C++, a const variable can be modified.");
answers.add("False"); // Because const variables cannot be modified

questions.add("In C++, a reference variable can be reassigned.");
answers.add("False"); // Because reference variables cannot be reassigned

questions.add("In C++, a pointer can be initialized with a reference.");
answers.add("True"); // Because pointers can be initialized with references

questions.add("In C++, a void pointer can be dereferenced.");
answers.add("False"); // Because void pointers cannot be dereferenced

questions.add("In C++, a function can return a reference to a local variable.");
answers.add("False"); // Because functions cannot return references to local variables

questions.add("In C++, a function can have multiple return statements.");
answers.add("True"); // Because functions can have multiple return statements

questions.add("In C++, a switch statement can have a default case.");
answers.add("True"); // Because switch statements can have a default case

questions.add("In C++, a try-catch block can catch all types of exceptions.");
answers.add("True"); // Because try-catch blocks can catch all types of exceptions

questions.add("In C++, a class can inherit from multiple base classes.");
answers.add("True"); // Because classes can inherit from multiple base classes

questions.add("In C++, a class can have multiple constructors.");
answers.add("True"); // Because classes can have multiple constructors

questions.add("In C++, a class can have a constructor with a different name.");
answers.add("False"); // Because constructors must have the same name as the class

questions.add("In C++, a struct is equivalent to a class.");
answers.add("True"); // Because structs are equivalent to classes

questions.add("In C++, a enum can be defined inside a class.");
answers.add("True"); // Because enums can be defined inside classes

questions.add("In C++, a template function can be overloaded.");
answers.add("True"); // Because template functions can be overloaded

questions.add("In C++, a template class can have non-template members.");
answers.add("True"); // Because template classes can have non-template members

questions.add("In C++, a namespace can be defined inside a class.");
answers.add("False"); // Because namespaces cannot be defined inside classes

questions.add("In C++, a friend function can access private members.");
answers.add("True"); // Because friend functions can access private members

questions.add("In C++, a vector can store elements of different data types.");
answers.add("False"); // Because vectors can only store elements of the same data type

questions.add("In C++, a map can have multiple keys with the same value.");
answers.add("True"); // Because maps can have multiple keys with the same value

questions.add("In C++, a smart pointer is equivalent to a raw pointer.");
answers.add("False"); // Because smart pointers are not equivalent to raw pointers

questions.add("In C++, a lambda function can capture variables by value and reference.");
answers.add("True"); // Because lambda functions can capture variables by value and reference

questions.add("In C++, a std::array can be resized dynamically.");
answers.add("False"); // Because std::array cannot be resized dynamically

questions.add("In C++, a std::string can be modified using std::cin.");
answers.add("True"); // Because std::string can be modified using std::cin

questions.add("In C++, a function can be overloaded based on return type only.");
answers.add("False"); // Because functions cannot be overloaded based on return type only

questions.add("In C++, a class can have a pure virtual destructor.");
answers.add("True"); // Because classes can have pure virtual destructors

questions.add("In C++, a constructor can be declared as a friend function.");
answers.add("True"); // Because constructors can be declared as friend functions

questions.add("In C++, a enum class can be used as a switch statement case.");
answers.add("True"); // Because enum classes can be used as switch statement cases

questions.add("In C++, a const variable can be passed by reference to a function.");
answers.add("True"); // Because const variables can be passed by reference to functions

questions.add("In C++, a function can throw multiple exceptions using a single throw statement.");
answers.add("False"); // Because functions cannot throw multiple exceptions using a single throw statement

questions.add("In C++, a namespace can be extended using the using directive.");
answers.add("True"); // Because namespaces can be extended using the using directive

questions.add("In C++, a template metaprogram can be used to compute values at compile-time.");
answers.add("True"); // Because template metaprograms can be used to compute values at compile-time

questions.add("In C++, a static_assert declaration can be used to check a condition at compile-time.");
answers.add("True"); // Because static_assert declarations can be used to check conditions at compile-time

    }
    
    public static void main(String[]args){
        new C_Plus_Plus_TF(name).setVisible(true);
    }
    
}

