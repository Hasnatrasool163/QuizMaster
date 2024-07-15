package firstListFrames;


import frame.Quiz;

/**
 *
 * @author MuhammadHasnatRasool
 */

public class C_Hash_Quiz extends Quiz{
    
    public C_Hash_Quiz(String name){
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


    // 60 mcqs
    
    @Override
    public final void loadQuestions() {
        questions.add("What does C# stand for?");
        options.add("A) C Sharp, B) Common Sharp, C) Core Sharp, D) Coded Sharp");
        answers.add("A) C Sharp");

        questions.add("Which of the following is NOT a primitive data type in C#?");
        options.add("A) int, B) double, C) string, D) array");
        answers.add("D) array");

        questions.add("How do you declare a variable in C#?");
        options.add("A) var x;, B) int x;, C) x = 5;, D) float x = 5.0;");
        answers.add("B) int x;");

        questions.add("Which keyword is used to define a constant in C#?");
        options.add("A) constant, B) define, C) final, D) const");
        answers.add("D) const");

        questions.add("What is the correct way to create a single-line comment in C#?");
        options.add("A) // This is a comment, B) <!-- This is a comment -->, C) /* This is a comment */, D) # This is a comment");
        answers.add("A) // This is a comment");

        questions.add("Which of the following is NOT a valid identifier in C#?");
        options.add("A) _myVar, B) 123myVar, C) myVar123, D) myVar");
        answers.add("B) 123myVar");

        questions.add("What does the 'void' keyword mean in a method declaration?");
        options.add("A) It returns an integer value, B) It doesn't return any value, C) It returns a float value, D) It returns a boolean value");
        answers.add("B) It doesn't return any value");

        questions.add("How do you start a new line of code block in C#?");
        options.add("A) {, B) (, C) [, D) <");
        answers.add("A) {");

        questions.add("Which data type is used to store a single character in C#?");
        options.add("A) char, B) character, C) string, D) byte");
        answers.add("A) char");

        questions.add("What is the result of `3 + 4 * 2` in C#?");
        options.add("A) 10, B) 14, C) 11, D) 15");
        answers.add("B) 14");

        questions.add("Which of the following is the correct way to declare a two-dimensional array in C#?");
        options.add("A) int[2,2] arr = {{1,2},{3,4}};, B) int[][] arr = {{1,2},{3,4}};, C) int arr[2][2] = {{1,2},{3,4}};, D) int[,] arr = {{1,2},{3,4}};");
        answers.add("D) int[,] arr = {{1,2},{3,4}};");

        questions.add("What does the 'this' keyword refer to in C#?");
        options.add("A) It refers to the current class instance, B) It refers to the base class instance, C) It refers to the derived class instance, D) It refers to the parent class instance");
        answers.add("A) It refers to the current class instance");

        questions.add("Which operator is used to perform type casting in C#?");
        options.add("A) (cast), B) cast, C) as, D) (type)");
        answers.add("A) (cast)");

        questions.add("What is the correct way to declare a method that returns an integer in C#?");
        options.add("A) int myMethod() { return 5; } B) void myMethod() { return 5; } C) int myMethod() => 5; D) int myMethod => 5;");
        answers.add("A) int myMethod() { return 5; }");

        questions.add("Which keyword is used to inherit from a class in C#?");
        options.add("A) superclass, B) extends, C) inherit, D) :");
        answers.add("D) :");

        questions.add("What is the default value of an integer variable in C# if it's not initialized?");
        options.add("A) 0, B) 1, C) null, D) Undefined");
        answers.add("A) 0");

        questions.add("What is the correct way to declare a nullable type in C#?");
        options.add("A) int? x;, B) Nullable<int> x;, C) var x = null;, D) int x = null;");
        answers.add("A) int? x;");

        questions.add("Which statement is used to exit from a loop in C#?");
        options.add("A) stop, B) continue, C) exit, D) break");
        answers.add("D) break");

        questions.add("How do you round a floating-point number to the nearest integer in C#?");
        options.add("A) Math.ceil(), B) Math.floor(), C) Math.round(), D) Math.trunc()");
        answers.add("C) Math.round()");

        questions.add("What does the `using` directive do in C#?");
        options.add("A) It imports a namespace, B) It defines a variable, C) It includes a header file, D) It initializes an object");
        answers.add("A) It imports a namespace");

        questions.add("Which keyword is used to define a new class in C#?");
        options.add("A) class, B) Class, C) cls, D) NewClass");
        answers.add("A) class");

        questions.add("What is the correct way to declare a property in C#?");
        options.add("A) int myProperty { get; set; }, B) int myProperty() { return value; }, C) void myProperty = value;, D) property int myProperty;");
        answers.add("A) int myProperty { get; set; }");

        questions.add("Which method is called automatically when an object is destroyed in C#?");
        options.add("A) destroy(), B) finalize(), C) dispose(), D) delete()");
        answers.add("B) finalize()");

        questions.add("What is the correct way to catch an exception in C#?");
        options.add("A) catch (Exception e) { }, B) try { } finally { }, C) finally { } catch (Exception e) { }, D) except (Exception e) { }");
        answers.add("A) catch (Exception e) { }");

        questions.add("Which of the following is NOT a valid access modifier in C#?");
        options.add("A) public, B) private, C) internal, D) global");
        answers.add("D) global");

        questions.add("What is the correct way to define a constructor in C#?");
        options.add("A) constructor() { }, B) void constructor() { }, C) ~constructor() { }, D) MyClass() { }");
        answers.add("D) MyClass() { }");

        questions.add("What is the purpose of the `static` keyword in C#?");
        options.add("A) It allows access to static members, B) It restricts class inheritance, C) It defines constant values, D) It initializes class variables");
        answers.add("A) It allows access to static members");

        questions.add("Which keyword is used to prevent a method from being overridden in C#?");
        options.add("A) sealed, B) static, C) final, D) override");
        answers.add("A) sealed");

        questions.add("What does the `abstract` keyword indicate in C#?");
        options.add("A) It specifies that a class cannot be instantiated, B) It indicates a base class, C) It defines an interface, D) It defines a virtual method");
        answers.add("A) It specifies that a class cannot be instantiated");

        questions.add("How do you define an interface in C#?");
        options.add("A) interface MyInterface { }, B) class MyInterface { }, C) interface class MyInterface { }, D) abstract MyInterface { }");
        answers.add("A) interface MyInterface { }");

        questions.add("Which statement is used to throw an exception in C#?");
        options.add("A) throw new Exception();, B) catch (Exception e) { }, C) try { }, D) throw Exception;");
        answers.add("A) throw new Exception();");

        questions.add("What is the correct way to compare two strings for equality in C#?");
        options.add("A) str1 == str2, B) str1.equals(str2), C) str1.compare(str2), D) compare(str1, str2)");
        answers.add("A) str1 == str2");

        questions.add("How do you declare a method that can be accessed without creating an instance of the class in C#?");
        options.add("A) private void myMethod() { }, B) public static void myMethod() { }, C) static void myMethod() { }, D) void myMethod() { }");
        answers.add("C) static void myMethod() { }");

        questions.add("What is the correct way to define a delegate in C#?");
        options.add("A) delegate MyDelegate();, B) void delegate MyDelegate();, C) delegate void MyDelegate();, D) MyDelegate delegate = new MyDelegate();");
        answers.add("C) delegate void MyDelegate();");

        questions.add("Which of the following collections allows duplicate elements in C#?");
        options.add("A) HashSet, B) Dictionary, C) SortedList, D) List");
        answers.add("D) List");

        questions.add("What does LINQ stand for in C#?");
        options.add("A) Linked Interface Query, B) Language Integrated Query, C) List Integrated Query, D) Linked Integration Query");
        answers.add("B) Language Integrated Query");

        questions.add("Which statement is used to terminate the execution of a method in C#?");
        options.add("A) terminate, B) continue, C) exit, D) return");
        answers.add("D) return");

        questions.add("What is the correct way to define an enumeration in C#?");
        options.add("A) enum MyEnum { Value1, Value2 }, B) enum MyEnum { Value1 = 1, Value2 = 2 }, C) enum MyEnum = { Value1, Value2 }, D) enum MyEnum { 1 = Value1, 2 = Value2 }");
        answers.add("A) enum MyEnum { Value1, Value2 }");

        questions.add("How do you access the length of a string in C#?");
        options.add("A) str.Length, B) str.size(), C) str.length(), D) len(str)");
        answers.add("A) str.Length");

        questions.add("Which keyword is used to exit from a loop iteration in C#?");
        options.add("A) exit, B) continue, C) skip, D) break");
        answers.add("D) break");

        questions.add("What is the correct way to convert a string to an integer in C#?");
        options.add("A) Convert.ToInt32(str), B) int.Parse(str), C) str.ToInt32(), D) (int)str");
        answers.add("A) Convert.ToInt32(str)");

        questions.add("Which statement is used to open a file in C#?");
        options.add("A) File.open(), B) file.open(), C) System.IO.open(), D) new FileStream()");
        answers.add("D) new FileStream()");

        questions.add("What does the `async` keyword indicate in C#?");
        options.add("A) It indicates a synchronous method, B) It indicates an asynchronous method, C) It allows for parallel execution, D) It disables thread synchronization");
        answers.add("B) It indicates an asynchronous method");

        questions.add("How do you define a lambda expression in C#?");
        options.add("A) (int x, int y) => x + y, B) lambda(int x, int y) => x + y, C) lambda x, y => x + y, D) (x, y) => x + y");
        answers.add("A) (int x, int y) => x + y");

        questions.add("What is the correct way to raise an event in C#?");
        options.add("A) EventHandler();, B) event.raise();, C) RaiseEvent();, D) OnEvent();");
        answers.add("D) OnEvent();");

        questions.add("Which of the following is NOT a valid way to declare a method in C#?");
        options.add("A) public void myMethod() { }, B) void myMethod() { }, C) public myMethod() { }, D) static void myMethod() { }");
        answers.add("C) public myMethod() { }");

        questions.add("How do you define an extension method in C#?");
        options.add("A) void myMethod(this MyClass obj) { }, B) static void myMethod(this MyClass obj) { }, C) extend void myMethod(this MyClass obj) { }, D) static myMethod(this MyClass obj) { }");
        answers.add("B) static void myMethod(this MyClass obj) { }");

        questions.add("Which of the following is used to implement method overriding in C#?");
        options.add("A) new keyword, B) override keyword, C) virtual keyword, D) base keyword");
        answers.add("B) override keyword");

        questions.add("What is the purpose of the `using` statement in C#?");
        options.add("A) It automatically disposes of objects, B) It imports namespaces, C) It includes external libraries, D) It initializes variables");
        answers.add("A) It automatically disposes of objects");

        questions.add("Which statement is used to handle exceptions in C#?");
        options.add("A) catch (Exception e) { }, B) try { } finally { }, C) finally { } catch (Exception e) { }, D) except (Exception e) { }");
        answers.add("A) catch (Exception e) { }");

        questions.add("What is the correct way to create a new instance of a class in C#?");
        options.add("A) MyClass obj = new MyClass();, B) new MyClass();, C) obj = new MyClass();, D) MyClass();");
        answers.add("A) MyClass obj = new MyClass();");

        questions.add("Which statement is used to throw an exception in C#?");
        options.add("A) throw new Exception();, B) catch (Exception e) { }, C) try { }, D) throw Exception;");
        answers.add("A) throw new Exception();");

        questions.add("What is the correct way to create a custom exception class in C#?");
        options.add("A) class CustomException : Exception { }, B) class CustomException extends Exception { }, C) exception CustomException { }, D) class Exception.CustomException { }");
        answers.add("A) class CustomException : Exception { }");

        questions.add("How do you handle multiple exceptions in a single catch block in C#?");
        options.add("A) catch (Exception e) { }, B) catch (ExceptionA | ExceptionB e) { }, C) try { } catch (ExceptionA e) { } catch (ExceptionB e) { }, D) try { } catch (ExceptionA || ExceptionB e) { }");
        answers.add("C) try { } catch (ExceptionA e) { } catch (ExceptionB e) { }");

        questions.add("Which keyword is used to prevent a class from being inherited in C#?");
        options.add("A) sealed, B) static, C) final, D) override");
        answers.add("A) sealed");

        questions.add("What does the `as` keyword do in C#?");
        options.add("A) It casts an object to a specified type, B) It declares an asynchronous method, C) It defines an alias for a namespace, D) It restricts access to a class");
        answers.add("A) It casts an object to a specified type");

        questions.add("Which statement is used to read input from the console in C#?");
        options.add("A) read(), B) Console.input(), C) Console.ReadLine(), D) input()");
        answers.add("C) Console.ReadLine()");

        questions.add("What is the correct way to create a parameterized constructor in C#?");
        options.add("A) MyClass() { }, B) MyClass(int x) { }, C) constructor MyClass(int x) { }, D) MyClass.constructor(int x) { }");
        answers.add("B) MyClass(int x) { }");

        questions.add("How do you define a property with both get and set accessors in C#?");
        options.add("A) int MyProperty { get; }, B) int MyProperty { set; }, C) int MyProperty { get; set; }, D) property int MyProperty;");
        answers.add("C) int MyProperty { get; set; }");

        questions.add("Which statement is used to convert an integer to a string in C#?");
        options.add("A) ToString(), B) Convert.String(), C) intToString(), D) int.ToString()");
        answers.add("D) int.ToString()");

    }
    

    
    public static void main(String[]args){
        new C_Hash_Quiz(name).setVisible(true);
    }
}
