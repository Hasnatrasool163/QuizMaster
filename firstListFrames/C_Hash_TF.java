package firstListFrames;

import frame.True_False_Questions;

public class C_Hash_TF extends True_False_Questions {

    public C_Hash_TF(String name) {
        super(name);
    }
 
// C hash tf 72
    @Override
    public final void loadQuestions() {
        questions.add("The dynamic keyword is used to define a static type that can be changed at runtime.");
        answers.add("False");

        questions.add("The explict keyword is used to define an implicit conversion operator.");
        answers.add("False");

        questions.add("The implicit keyword is used to define an explicit conversion operator.");
        answers.add("False");

        questions.add("The params keyword is used to define a method that takes a variable number of out parameters.");
        answers.add("False");

        questions.add("The out keyword is used to define a method that takes a variable number of ref parameters.");
        answers.add("False");

        questions.add("The ref keyword is used to define a method that takes a variable number of out parameters.");
        answers.add("False");

        questions.add("The in keyword is used to define a method that takes a variable number of in parameters.");
        answers.add("True");

        questions.add("The sizeof operator is used to determine the size of a type in bytes at runtime.");
        answers.add("True");

        questions.add("The typeof operator is used to determine the type of an object at runtime.");
        answers.add("True");

        questions.add("The is operator is used to determine if an object is compatible with a given type.");
        answers.add("True");

        questions.add("The as operator is used to cast an object to a given type or return null if the cast fails.");
        answers.add("True");

        questions.add("The await keyword is used to suspend the execution of a method until a task is completed synchronously.");
        answers.add("False");

        questions.add("The yield keyword is used to define an iterator that returns a sequence of values synchronously.");
        answers.add("False");

        questions.add("The async keyword is used to define a method that returns a task that represents an asynchronous operation.");
        answers.add("True");

        questions.add("The Task.Run method is used to run a method synchronously on a thread pool thread.");
        answers.add("False");

        questions.add("The Parallel.ForEach method is used to execute a loop in parallel across multiple threads synchronously.");
        answers.add("False");

        questions.add("The lock statement is used to synchronize access to a resource by multiple threads at the same time.");
        answers.add("True");

        questions.add("The Monitor.Enter method is used to acquire an exclusive lock on a resource synchronously.");
        answers.add("True");

        questions.add("C# is not an object-oriented programming language.");
        answers.add("False");

        questions.add("C# is developed by Facebook.");
        answers.add("False");

        questions.add("The using statement is used to import namespaces in C#.");
        answers.add("True");

        questions.add("The class keyword is used to define a class in C#.");
        answers.add("True");

        questions.add("The struct keyword is used to define a structure in C#.");
        answers.add("True");

        questions.add("The enum keyword is used to define an enumeration in C#.");
        answers.add("True");

        questions.add("The interface keyword is used to define an abstract class in C#.");
        answers.add("False");

        questions.add("The abstract keyword is used to define an Interface in C#.");
        answers.add("False");

        questions.add("The sealed keyword is used to define a sealed class in C#.");
        answers.add("True");

        questions.add("The static keyword is used to define a static private member in C#.");
        answers.add("False");

        questions.add("The const keyword is used to define a constant in C#.");
        answers.add("True");

        questions.add("The readonly keyword is used to define a read-only field in C#.");
        answers.add("True");

        questions.add("The params keyword is used to define a parameter array in C#.");
        answers.add("True");

        questions.add("The ref keyword is used to pass a parameter by value and hidden in C#.");
        answers.add("False");

        questions.add("The out keyword is used to pass a parameter by output in C#.");
        answers.add("True");

        questions.add("The in keyword is used to pass a parameter by input in C#.");
        answers.add("True");

        questions.add("The try-catch block is used to handle exceptions in C#.");
        answers.add("True");

        questions.add("The finally block is used to execute code if some exceptions occur in C#.");
        answers.add("False");

        questions.add("The throw keyword is used to throw an exception in C#.");
        answers.add("True");

        questions.add("The return keyword is used to return a value from a method in C#.");
        answers.add("True");

        questions.add("The yield keyword is used to return a value from an iterator in C#.");
        answers.add("True");

        questions.add("The async keyword is used to define an asynchronous method in C#.");
        answers.add("True");

        questions.add("The await keyword is used to wait for a task to complete in C#.");
        answers.add("True");

        questions.add("The Task class is used to represent an asynchronous operation in C#.");
        answers.add("True");

        questions.add("The Thread class is used to represent a thread in C#.");
        answers.add("True");

        questions.add("The Lock class is used to synchronize access to a resource in C#.");
        answers.add("True");

        questions.add("The Monitor class is used to synchronize access to a resource in C#.");
        answers.add("True");

        questions.add("The Mutex class is used to synchronize access to a resource in C#.");
        answers.add("True");

        questions.add("The Semaphore class is used to synchronize access to a resource in C#.");
        answers.add("True");

        questions.add("The Event class is used to represent an event in C#.");
        answers.add("True");

        questions.add("The Delegate class is used to represent a delegate in C#.");
        answers.add("True");

        questions.add("The Lambda expression is used to define a lambda function in C#.");
        answers.add("True");

        questions.add("The LINO is used to query data in C#.");
        answers.add("False");

        questions.add("The async keyword is used to define an asynchronous method that returns a Task object.");
        answers.add("True");

        questions.add("The await keyword is used to suspend the execution of a synchronous method until a Task object is completed.");
        answers.add("False");

        questions.add("The Lazy<T> class is used to implement eager initialization for a type T.");
        answers.add("False");

        questions.add("The LINQ query syntax is used to define a query that retrieves data from a database.");
        answers.add("True");

        questions.add("The foreach loop is used to iterate over a collection of objects in reverse order.");
        answers.add("False");

        questions.add("The using statement is used to ensure that a resource is properly disposed of before it is no longer needed.");
        answers.add("False");

        questions.add("The try-catch block is used to handle exceptions that occur during the execution of a block of code.");
        answers.add("True");

        questions.add("The finally block is used to execute code only if an exception occurs during the execution of a block of code.");
        answers.add("False");

        questions.add("The delegate keyword is used to define a type that represents a reference to a field with a specific signature.");
        answers.add("False");

        questions.add("The event keyword is used to define a type that represents a notification that something has not happened.");
        answers.add("False");

        questions.add("The interface keyword is used to define a contract that must be implemented by any struct that implements it.");
        answers.add("False");

        questions.add("The abstract keyword is used to define a class that can be instantiated and is used as a base class for other classes.");
        answers.add("False");

        questions.add("The sealed keyword is used to define a class that can be inherited from.");
        answers.add("False");

        questions.add("The static keyword is used to define a member that belongs to an instance of a type rather than the type itself.");
        answers.add("False");

        questions.add("The const keyword is used to define a constant value that can be changed after it is defined.");
        answers.add("False");

        questions.add("The readonly keyword is used to define a field that can be assigned a value at any time.");
        answers.add("False");

        questions.add("The volatile keyword is used to define a field that can only be modified by a single thread at a time.");
        answers.add("False");

        questions.add("The lock statement is used to synchronize access to a resource by a single thread at a time.");
        answers.add("False");

        questions.add("The Monitor class is used to synchronize access to a resource by multiple threads at the same time.");
        answers.add("True");

        questions.add("The Mutex class is used to synchronize access to a resource by multiple threads across different processes at the same time.");
        answers.add("True");

        questions.add("The Semaphore class is used to limit the number of threads that can access a resource concurrently to a maximum of one thread.");
        answers.add("False");

    }

    public static void main(String[] args) {
        new C_Hash_TF(name).setVisible(true);
    }

}
