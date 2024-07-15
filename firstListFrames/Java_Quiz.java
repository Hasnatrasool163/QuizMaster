package firstListFrames;


import frame.Quiz;
/**
 *
 * @author MuhammadHasnatRasool
 */
public class Java_Quiz extends Quiz {

    public Java_Quiz(String name) {
        super(name);
        loadQuestions();
        setupQuiz();
        
    }
    private void setupQuiz() {
        shuffleIndices();
        selectTotalQuestions();
        setCurrentQuestion();
        setQuestionTextAndOptions();
    }
    
     @Override
    public void setQuestionTextAndOptions() {
        qno.setText("Question #: " + currentQno);
        question.setText(questions.get(currentQuestionIndex));
        opt1.setText(options.get(currentQuestionIndex).split(", ")[0]);
        opt2.setText(options.get(currentQuestionIndex).split(", ")[1]);
        opt3.setText(options.get(currentQuestionIndex).split(", ")[2]);
        opt4.setText(options.get(currentQuestionIndex).split(", ")[3]);
    }

    // quiz: 66
    @Override
    public final void loadQuestions() {

        questions.add("What is the purpose of the finally block in a Java try-catch statement?");
        options.add("A) To handle errors, B) To handle exceptions, C) To ensure resource release, D) To provide alternative code");
        answers.add("C) To ensure resource release");

        questions.add("Which Java collection class is suitable for storing a large number of elements and provides fast lookup, insertion, and deletion operations?");
        options.add("A) ArrayList, B) LinkedList, C) HashSet, D) TreeSet");
        answers.add("C) HashSet");

        questions.add("What is the difference between the == and .equals() methods in Java?");
        options.add("A) == checks reference equality .equals() checks object equality, B) == checks object equality .equals() checks reference equality, C) == is used for primitives .equals() is used for objects, D) == is used for objects .equals() is used for primitives");
        answers.add("A) == checks reference equality .equals() checks object equality");

        questions.add("How do you handle a NullPointerException in Java?");
        options.add("A) Use a try-catch block, B) Use an if-else statement, C) Use a ternary operator, D) Use a do-while loop");
        answers.add("A) Use a try-catch block");

        questions.add("What is the purpose of the volatile keyword in Java?");
        options.add("A) To ensure thread safety, B) To improve performance, C) To reduce memory usage, D) To enhance code readability");
        answers.add("A) To ensure thread safety");

        questions.add("Which Java design pattern is used to create a singleton instance of a class?");
        options.add("A) Factory pattern, B) Singleton pattern, C) Observer pattern, D) Decorator pattern");
        answers.add("B) Singleton pattern");

        questions.add("How do you implement a thread-safe singleton in Java?");
        options.add("A) Use a synchronized block, B) Use a lock object, C) Use a volatile variable, D) Use a static instance");
        answers.add("A) Use a synchronized block");

        questions.add("What is the difference between the Thread class and the Runnable interface in Java?");
        options.add("A) Thread is a class  Runnable is an interface, B) Thread is an interface Runnable is a class, C) Thread is used for multithreading Runnable is used for single-threading, D) Thread is used for single-threading Runnable is used for multithreading");
        answers.add("A) Thread is a class  Runnable is an interface");

        questions.add("How do you create a deadlock in Java?");
        options.add("A) By using synchronized blocks, B) By using lock objects, C) By using volatile variables, D) By using static instances");
        answers.add("A) By using synchronized blocks");

        questions.add("What is the purpose of the transient keyword in Java?");
        options.add("A) To serialize an object, B) To deserialize an object, C) To ignore a field during serialization, D) To include a field during deserialization");
        answers.add("C) To ignore a field during serialization");

        questions.add("Which Java collection class is suitable for storing a large number of elements and provides fast lookup insertion and deletion operations but does not maintain the order of elements?");
        options.add("A) ArrayList, B) LinkedList, C) HashSet, D) TreeSet");
        answers.add("C) HashSet");

        questions.add("How do you handle a StackOverflowError in Java?");
        options.add("A) By increasing the stack size, B) By decreasing the stack size, C) By using a try-catch block, D) By using an if-else statement");
        answers.add("A) By increasing the stack size");

        questions.add("What is the difference between the HashMap and TreeMap classes in Java?");
        options.add("A) HashMap is a hash table TreeMap is a balanced tree, B) HashMap is a balanced tree TreeMap is a hash table, C) HashMap is used for cachin  TreeMap is used for sorting, D) HashMap is used for sorting TreeMap is used for caching");
        answers.add("A) HashMap is a hash table TreeMap is a balanced tree");

        questions.add("How do you implement a cache in Java?");
        options.add("A) By using a HashMap, B) By using a TreeMap, C) By using a HashSet, D) By using a ArrayList");
        answers.add("A) By using a HashMap");

        questions.add("What is the basic syntax to print output in Java?");
        options.add("A) System.out.println(), B) printf(), C) print(), D) output()");
        answers.add("A) System.out.println()");

        questions.add("Given the string \"strawberries\" saved in a variable called fruit, what would fruit.substring(2, 5) return?");
        options.add("A) rawb, B) raw, C) awb, D) traw");
        answers.add("B) raw");

        questions.add("What is the purpose of the public static void main(String[] args) method in Java?");
        options.add("A) To define a class, B) To declare a variable, C) To start a program, D) To end a program");
        answers.add("C) To start a program");

        questions.add("How can you achieve runtime polymorphism in Java?");
        options.add("A) method overloading, B) method overrunning, C) method overriding, D) method calling");
        answers.add("C) method overriding");

        questions.add("Given the following definitions, which of these expressions will NOT evaluate to true?\nboolean b1 = true, b2 = false; int i1 = 1, i2 = 2;");
        options.add("A) (i1 | i2) == 3, B) i2 && b1, C) b1 || !b2, D) (i1 ^ i2) < 4");
        answers.add("B) i2 && b1");

        questions.add("What is the output of this code?\nclass Main {\n  public static void main (String[] args) {\n    int array[] = {1, 2, 3, 4};\n    for (int i = 0; i < array.size(); i++) {\n       System.out.print(array[i]);\n    }\n  }\n}");
        options.add("A) It will not compile because of line 4., B) It will not compile because of line 3., C) 123, D) 1234");
        answers.add("B) It will not compile because of line 3.");

        questions.add("Which of the following can replace the CODE SNIPPET to make the code below print \"Hello World\"?\ninterface Interface1 {\n    static void print() {\n        System.out.print(\"Hello\");\n    }\n}\n\ninterface Interface2 {\n    static void print() {\n        System.out.print(\"World!\");\n    }\n}");
        options.add("A) super1.print(); super2.print(), B) this.print(), C) super.print(), D) Interface1.print(); Interface2.print()");
        answers.add("D) Interface1.print(); Interface2.print()");

        questions.add("What does the following code print?\nString str = \"abcde\";\nstr.trim();\nstr.toUpperCase();\nstr.substring(3, 4);\nSystem.out.println(str);");
        options.add("A) CD, B) CDE, C) D, D) \"abcde\"");
        answers.add("D) \"abcde\"");

        questions.add("What is the result of this code?\nclass Main {\n    public static void main (String[] args){\n        System.out.println(print(1));\n    }\n    static Exception print(int i){\n        if (i > 0) {\n            return new Exception();\n        } else {\n            throw new RuntimeException();\n        }\n    }\n}");
        options.add("A) It will show a stack trace with a runtime exception., B) \"java.lang.Exception\", C) It will run and throw an exception., D) It will not compile.");
        answers.add("A) It will show a stack trace with a runtime exception.");

        questions.add("What is the purpose of the import statement in Java?");
        options.add("A) To define a class, B) To declare a variable, C) To include a package, D) To access a method");
        answers.add("C) To include a package");

        questions.add("What is the data type used to store large integers in Java?");
        options.add("A) int, B) long, C) float, D) double");
        answers.add("B) long");

        questions.add("What is the purpose of the toString() method in Java?");
        options.add("A) To convert an object to a string, B) To convert a string to an object, C) To compare two objects, D) To sort an array");
        answers.add("A) To convert an object to a string");

        questions.add("What is the purpose of the abstract class in Java?");
        options.add("A) To define a concrete class, B) To declare a variable, C) To define an abstract class, D) To access a method");
        answers.add("C) To define an abstract class");

        questions.add("What is the data type used to store decimal numbers in Java?");
        options.add("A) int, B) float, C) double, D) char");
        answers.add("B) float");

        questions.add("What is the purpose of the finally block in Java?");
        options.add("A) To handle exceptions, B) To declare a variable, C) To define a method, D) To exit a program");
        answers.add("A) To handle exceptions");

        questions.add("What will be the output of the following Java code snippet?\nint x = 5;\nSystem.out.println(x++);");
        options.add("A) 5, B) 6, C) Compilation error, D) Runtime error");
        answers.add("A) 5");

        questions.add("Which keyword is used to define a constant in Java?");
        options.add("A) `constant`, B) `final`, C) `static`, D) `const`");
        answers.add("B) `final`");

        questions.add("What does the `static` keyword mean when used with a method in Java?");
        options.add("A) To handle exceptions, B) To declare a variable, C) To define a method, D) To exit a program");
        answers.add("C) To define a method");

        questions.add("Which of the following correctly declares a method that can be accessed without creating an instance of the class?");
        options.add("A) public void method() {}, B) private static void method() {}, C) protected void method() {}, D) static void method() {}");
        answers.add("D) static void method() {}");

        questions.add("What is the default value of a boolean variable in Java?");
        options.add("A) true, B) false, C) null, D) 0");
        answers.add("B) false");

        questions.add("Which of the following is used to prevent a method from being overridden in Java?");
        options.add("A) final, B) static, C) private, D) abstract");
        answers.add("A) final");

        questions.add("Which collection class allows null as a key in Java?");
        options.add("A) TreeMap, B) HashMap, C) LinkedHashMap, D) HashSet");
        answers.add("B) HashMap");

        questions.add("What will be the output of the following Java code snippet?\nString s1 = \"Hello\";\nString s2 = \"Hello\";\nSystem.out.println(s1 == s2);");
        options.add("A) true, B) false, C) Compilation error, D) Runtime error");
        answers.add("A) true");

        questions.add("What is the size of `char` datatype in Java?");
        options.add("A) 4 bytes, B) 2 bytes, C) 1 byte, D) 8 bytes");
        answers.add("B) 2 bytes");

        questions.add("What is the purpose of the `this` keyword in Java?");
        options.add("A) To handle exceptions, B) To declare a variable, C) To refer to the current class instance, D) To exit a program");
        answers.add("C) To refer to the current class instance");

        questions.add("What will be the output of the following Java code snippet?\nint[] arr = {1, 2, 3};\nSystem.out.println(arr.length);");
        options.add("A) 1, B) 2, C) 3, D) Compilation error");
        answers.add("C) 3");

        questions.add("Which statement is used to exit from a loop in Java?");
        options.add("A) exit, B) return, C) break, D) continue");
        answers.add("C) break");

        questions.add("What is the output of the following Java code snippet?\nint x = 5;\nSystem.out.println(++x);");
        options.add("A) 5, B) 6, C) Compilation error, D) Runtime error");
        answers.add("B) 6");

        questions.add("What is the purpose of the `instanceof` operator in Java?");
        options.add("A) To create an instance of a class, B) To check if two objects are the same, C) To compare two objects, D) To check if an object is an instance of a particular class");
        answers.add("D) To check if an object is an instance of a particular class");

        questions.add("What is the purpose of the `interface` keyword in Java?");
        options.add("A) To define a concrete class, B) To declare a variable, C) To define an interface, D) To access a method");
        answers.add("C) To define an interface");

        questions.add("Which of the following is true about method overriding in Java?");
        options.add("A) A subclass method can override a superclass method if they have the same (name-arguments-return type), B) A subclass method can override a superclass method only if the superclass method is declared as `final`, C) A subclass method can override a superclass method only if the subclass method is declared as `final`, D) Method overriding is not allowed in Java");
        answers.add("A) A subclass method can override a superclass method if they have the same (name-arguments-return type)");

        questions.add("What is the purpose of the `default` keyword in Java `switch` statements?");
        options.add("A) To define a default case, B) To terminate the switch statement, C) To skip the current iteration");
        answers.add("A) To define a default case");

        questions.add("What is the purpose of the `super` keyword in Java?");
        options.add("A) To access superclass methods and constructors, B) To define a superclass, C) To call a static method, D) To declare a variable");
        answers.add("A) To access superclass methods and constructors");

        questions.add("Which of the following is NOT a primitive data type in Java?");
        options.add("A) int, B) float, C) String, D) boolean");
        answers.add("C) String");

        questions.add("What is the result of `10 % 3` in Java?");
        options.add("A) 3, B) 1, C) 2, D) 0");
        answers.add("B) 1");

        questions.add("What is the purpose of the `break` statement in Java?");
        options.add("A) To exit a loop or switch statement, B) To skip the current iteration in a loop, C) To define a case in a switch statement, D) To terminate the program");
        answers.add("A) To exit a loop or switch statement");

        questions.add("Which of the following correctly declares a `String` in Java?");
        options.add("A) String s1 = null;, B) String s2 = \"\";, C) String s3 = new String();, D) All of the above");
        answers.add("D) All of the above");

        questions.add("What is the purpose of the `volatile` keyword in Java?");
        options.add("A) To define a variable, B) To allow access to subclass methods, C) To prevent the JVM from optimizing code involving the variable, D) To synchronize threads");
        answers.add("C) To prevent the JVM from optimizing code involving the variable");

        questions.add("What will be the output of the following Java code snippet?\nint x = 10;\nif (x > 5) {\n    System.out.println(\"Hello\");\n}");
        options.add("A) Hello, B) Compilation error, C) Runtime error, D) No output");
        answers.add("A) Hello");

        questions.add("Which keyword is used to create a subclass in Java?");
        options.add("A) class, B) subclass, C) extends, D) implements");
        answers.add("C) extends");

        questions.add("What is the purpose of the `throws` keyword in Java?");
        options.add("A) To declare an exception, B) To catch an exception, C) To handle an exception, D) To define a method");
        answers.add("A) To declare an exception");

        questions.add("What is the purpose of the `protected` access modifier in Java?");
        options.add("A) To restrict access to within the same package, B) To allow access from any class, C) To allow access to subclasses and classes within the same package, D) To allow access to subclasses only");
        answers.add("C) To allow access to subclasses and classes within the same package");

        questions.add("What is the purpose of the `static` keyword in Java?");
        options.add("A) To define a static class, B) To create multiple instances of a class, C) To access class variables and methods without creating an instance of the class, D) To declare a variable");
        answers.add("C) To access class variables and methods without creating an instance of the class");

        questions.add("Which of the following declaration of the array contains the error?");
        options.add("A) int x[ ]= int[10];, B) int [ ] y=new int[5];, C) float d[ ]= {1,2,3};, D) int a[ ] = {1, 2,3; int b[ ]; b=a;");
        answers.add("A) int x[ ]= int[10];");

        questions.add("There is a companion class to string called ………………….., whose objects contain strings that can be modified after they are created.");
        options.add("A) stringBuffer, B) stringClass, C) toString( ), D) stringChar");
        answers.add("A) stringBuffer");

        questions.add("Which of the following classes are available in the java.lang package?");
        options.add("A)Stack, B) Object, C) Math, D) Random");
        answers.add("B)Object");

        questions.add("Consider the following code,\nstring s=new String(); will create an instance of string with");
        options.add("A) at least one character, B) a default character, C) no characters in it, D) number of characters in it");
        answers.add("C) no characters in it");

        questions.add("…………………. returns a sting that contains the human-readable equivalent of the value with which it is called.");
        options.add("A) toValue(), B) value(), C) valueOf(), D) getValue()");
        answers.add("C) valueOf()");

        questions.add("………………… method simply return a string that appropriately describes an object of your class.");
        options.add("A) getChars(), B) toString(), C) toCharArray(), D) getString()");
        answers.add("B) toString()");

        questions.add("To extract a single character from a sting, you can refer directly to an individual character via the …………………… method.");
        options.add("A) charAt(), B) getChars(), C) getCharAt(), D) getAt()");
        answers.add("A) charAt()");

        questions.add("If you need to extract more than one character at a time, you can use the …………………………. .");
        options.add("A) getBytes(), B) charAt(), C) getChars(), D) getString()");
        answers.add("C) getChars()");

        questions.add("If S1 and S2 are two strings, which of the following statements or expressions are correct.");
        options.add("A)String S3=S1+S2;, B) String S3=S1-S2;, C) S1<=S2;, D) S1.compareTo(S2);");
        answers.add("D) S1.compareTo(S2);");

        questions.add("For the following expression,\nString S=new String(“abc”);\nWhich of the following calls are valid?");
        options.add("A) i) S.trim(), B) S.replace(‘a’, ‘A’), C) S.Substring(3), D) S.toUpperCase()");
        answers.add("D) S.toUpperCase()");

        questions.add("What will be the output of the following code?\nString S=new String();");
        options.add("A) null, B) error, C) =S, D) S=");
        answers.add("D) S=");

        questions.add("…………………………….. is most useful when you are exporting a value into does support 16-bit unicode characters.");
        options.add("A) getChars(), B) getString(), C) getValue(), D) getBytes()");
        answers.add("D) getBytes()");

        questions.add("You can use ……………………, if you want to convert all the characters in a string object into a character array.");
        options.add("A) toCharArray(), B) toString(), C) toChar(), D) toArray()");
        answers.add("A) toCharArray()");

        questions.add("Java programs are:");
        options.add("A) Faster than others, B) Platform independent, C) Not reusable, D) Not scalable");
        answers.add("B) Platform independent");

        questions.add("Java has its origin in:");
        options.add("A) C programming language, B) PERRL, C) COBOL, D) Oak programming language");
        answers.add("D) Oak programming language");

        questions.add("Which one of the following is true for Java:");
        options.add("A) Java is object oriented and interpreted, B) Java is efficient and faster than C, C) Java is the choice of everyone, D) Java is not robust");
        answers.add("A) Java is object oriented and interpreted");

        questions.add("The command javac is used to:");
        options.add("A) debug a java program, B) compile a java program, C) interpret a java program, D) execute a java program");
        answers.add("B) compile a java program");

        questions.add("Java servlets are an efficient and powerful solution for creating ………….. for the web:");
        options.add("A) Dynamic content, B) Static content, C) Hardware, D) Both a and b");
        answers.add("A) Dynamic content");

        questions.add("Filters were officially introduced in the Servlet ……………… specification:");
        options.add("A) 2.1, B) 2.3, C) 2.2, D) 2.4");
        answers.add("B) 2.3");

        questions.add("Which is the root class of all AWT events:");
        options.add("A) java.awt.ActionEvent, B) java.awt.AWTEvent, C) java.awt.event.AWTEvent, D) java.awt.event.Event");
        answers.add("B) java.awt.AWTEvent");

        questions.add("OOP features are:");
        options.add("A) Encapsulation Polymorphism Inheritance Abstraction, B) Encapsulation Polymorphism Inheritance, C) Encapsulation Abstraction Interface, D) none of the above");
        answers.add("B) Encapsulation Polymorphism Inheritance");

        questions.add("Break statement is used to:");
        options.add("A) Exit a loop and continue with the next statement, B) Exit a loop and continue with the next iteration Exit a switch statement, C) Exit a loop and continue with the next iteration Exit a switch statement, D) Exit a switch statement");
        answers.add("D) Exit a switch statement");

        questions.add("Native – protocol pure Java converts ……….. into the ………… used by DBMSs directly:");
        options.add("A) JDBC calls  network protocol, B) ODBC class  network protocol, C) ODBC class  user call, D) JDBC calls  user call");
        answers.add("A) JDBC calls network protocol");

    }

    public static void main(String[] args) {
        new Java_Quiz(name).setVisible(true);
    }
}
